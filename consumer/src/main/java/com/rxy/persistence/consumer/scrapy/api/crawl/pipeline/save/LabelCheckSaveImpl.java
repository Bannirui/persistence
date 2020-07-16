package com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.save;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelCheck;
import com.rxy.persistence.consumer.scrapy.api.dal.enumerate.TableNameEnum;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelBatchCheckService;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelCheckService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.ResultItems;

import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
@Service
@Slf4j
public class LabelCheckSaveImpl implements SaveService {

    @Autowired
    private RpLoanLabelCheckService rpLoanLabelCheckService;

    @Override
    public void save(ResultItems resultItems, String startTime, String endTime) {
        // 该逻辑处理的数据
        String name = TableNameEnum.CHECK.getName();
        // 从resultItems中get页面page put进去的数据列表
        List<RpLoanLabelCheck> rpLoanLabelCheckList = resultItems.get(name);
        // 数据判空 为空则不处理
        if (!CollectionUtils.isEmpty(rpLoanLabelCheckList)) {
            // 先删除对应日期列表的记录
            // delete from %s where (create_time >= '%s' and create_time <= '%s') or (modify_time >= '%s' and modify_time <= '%s')
            try {
                // 复杂语句用xml
                this.rpLoanLabelCheckService.deleteByTime(startTime, endTime);
            } catch (Exception e) {
                // 删除失败 不插入
                log.error("[-] api {}数据插入前删除日期{}到{}失败>>>{}", name, startTime, endTime, e.getMessage());
                return;
            }

            // 成功删除 遍历插入
            rpLoanLabelCheckList.forEach(rpLoanLabelCheck -> {
                this.rpLoanLabelCheckService.saveWithoutId(rpLoanLabelCheck);
            });
            log.error("[-] api {}数据插入成功", name);
        }
    }
}
