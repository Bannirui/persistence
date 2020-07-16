package com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.save;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.scrapy.api.dal.enumerate.TableNameEnum;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelBatchCheckService;
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
@Slf4j
@Service
public class LabelBatchCheckSaveImpl implements SaveService {

    @Autowired
    private RpLoanLabelBatchCheckService rpLoanLabelBatchCheckService;

    @Override
    public void save(ResultItems resultItems, String startTime, String endTime) {
        // 该逻辑处理的数据
        String name = TableNameEnum.BATCHCHECK.getName();
        // 从resultItems中get页面page put进去的数据列表
        List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList = resultItems.get(name);
        // 数据判空 为空则不处理
        if (!CollectionUtils.isEmpty(rpLoanLabelBatchCheckList)) {
            // 先删除对应日期列表的记录
            // delete from %s where create_time >= '%s' and create_time <= '%s'
            try {
                this.rpLoanLabelBatchCheckService.remove(new LambdaQueryWrapper<RpLoanLabelBatchCheck>().ge(RpLoanLabelBatchCheck::getCreateTime, startTime).le(RpLoanLabelBatchCheck::getCreateTime, endTime));
            } catch (Exception e) {
                // 删除失败 不插入
                log.error("[-] api {}数据插入前删除日期{}到{}失败>>>{}", name, startTime, endTime, e.getMessage());
                return;
            }

            // 成功删除 遍历插入
            rpLoanLabelBatchCheckList.forEach(rpLoanLabelBatchCheck -> {
                this.rpLoanLabelBatchCheckService.saveWithoutId(rpLoanLabelBatchCheck);
            });
            log.error("[-] api {}数据插入成功", name);
        }
    }
}
