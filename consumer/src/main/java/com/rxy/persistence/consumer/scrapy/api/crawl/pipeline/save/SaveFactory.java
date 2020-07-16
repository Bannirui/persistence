package com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.save;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
@Component
public class SaveFactory {

    @Autowired
    private LabelBatchCheckSaveImpl labelBatchCheckSave;

    @Autowired
    private LabelCheckAllSaveImpl labelCheckAllSave;

    @Autowired
    private LabelCheckSaveImpl labelCheckSave;

    @Autowired
    private SmsTemplateCheckSaveImpl smsTemplateCheckSave;

    @Autowired
    private StatisticsDaySaveImpl statisticsDaySave;

    public void save(ResultItems resultItems, String startTime, String endTime) {
        // 所有实现都调一遍
        this.labelBatchCheckSave.save(resultItems, startTime, endTime);
        this.labelCheckAllSave.save(resultItems, startTime, endTime);
        this.labelCheckSave.save(resultItems, startTime, endTime);
        this.smsTemplateCheckSave.save(resultItems, startTime, endTime);
        this.statisticsDaySave.save(resultItems, startTime, endTime);
    }
}
