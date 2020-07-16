package com.rxy.persistence.consumer.scrapy.api.crawl.pipeline;

import com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.save.SaveFactory;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelBatchCheckService;
import com.rxy.persistence.consumer.scrapy.statistics.utils.DateUtil;
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
@Component
public class ApiPipeline implements Pipeline {

    @Autowired
    private RpLoanLabelBatchCheckService rpLoanLabelBatchCheckService;

    @Autowired
    private SaveFactory saveFactory;


    @Override
    public void process(ResultItems resultItems, Task task) {

        // 保存数据库前先删除对应获取日期的记录 如果删除失败则不插入
        String startTime = DateUtil.getBeforeOrAfterDateStr(new Date(), -3);
        String endTime = DateUtil.getBeforeOrAfterDateStr(new Date(), 0);

        // 统一处理 是否存在数据->删除对应时间段记录->保存数据
        this.saveFactory.save(resultItems, startTime, endTime);

    }
}
