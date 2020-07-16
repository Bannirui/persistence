package com.rxy.persistence.consumer.scrapy.statistics.crawl.pipeline;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rxy.persistence.consumer.scrapy.statistics.dal.entity.StatisticsInfo;
import com.rxy.persistence.consumer.scrapy.statistics.service.StatisticsInfoService;
import com.rxy.persistence.consumer.scrapy.statistics.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Date;
import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Slf4j
@Component
public class StatisticsPipeline implements Pipeline {

    @Autowired
    private StatisticsInfoService statisticsInfoService;

    @Override
    public void process(ResultItems resultItems, Task task) {

        // 获取startTime->endTime的列表 作为key遍历 startTime为当前时间
        List<String> dateStrList = DateUtil.getDateStrList(new Date(), -7);

        String startTime = DateUtil.getBeforeOrAfterDateStr(new Date(), -7);
        String endTime = DateUtil.getBeforeOrAfterDateStr(new Date(), 0);

        // 插入数据前先删除该段时间记录
        try {
            this.statisticsInfoService.remove(new LambdaQueryWrapper<StatisticsInfo>().ge(StatisticsInfo::getSendDate, startTime).le(StatisticsInfo::getSendDate, endTime));
            // 数据库删除失败则不插入
        } catch (Exception e) {
            log.error("[-] statistics 数据库插入前先删除对应日期[{}]的记录>>>删除失败", dateStrList);
            return;
        }

        // pipeline从page中get到在processor中put进去的item 遍历时间列表 每个元素为Key
        for (String dateStr : dateStrList) {
            List<StatisticsInfo> dailyStatisticsInfoList = resultItems.get(dateStr);

            // 获取到的数据判空或者其他处理后可以存储数据库了
            if (CollectionUtils.isEmpty(dailyStatisticsInfoList)) {
                // 数据为空 不需要存数据库
                log.warn("[*] statistics 接口返回[{}]数据为空", dateStr);
                continue;
            }

            dailyStatisticsInfoList.forEach(statisticsInfo -> {
                // 主键自增 忽略字段id
                int effectedRows = this.statisticsInfoService.saveWithoutId(statisticsInfo);
            });
        }

    }
}
