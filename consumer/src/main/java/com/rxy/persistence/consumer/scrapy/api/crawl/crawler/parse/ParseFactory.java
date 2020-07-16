package com.rxy.persistence.consumer.scrapy.api.crawl.crawler.parse;

import com.alibaba.fastjson.JSONArray;
import com.rxy.persistence.consumer.scrapy.api.dal.enumerate.TableNameEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
@Component
public class ParseFactory {
    @Autowired
    private LabelBatchCheckParse labelBatchCheckParse;

    @Autowired
    private LabelCheckAllParse labelCheckAllParse;

    @Autowired
    private LabelCheckParse labelCheckParse;

    @Autowired
    private SmsTemplateCheckParse smsTemplateCheckParse;

    @Autowired
    private StatisticsDayParse statisticsDayParse;

    public void createParser(TableNameEnum tableNameEnum, Page page, JSONArray jsonArray) {
        switch (tableNameEnum) {
            case BATCHCHECK:
                this.labelBatchCheckParse.parseArray(page, jsonArray);
                break;
            case CHECKALL:
                this.labelCheckAllParse.parseArray(page, jsonArray);
                break;
            case CHECK:
                this.labelCheckParse.parseArray(page, jsonArray);
                break;
            case TEMPLATECHECK:
                smsTemplateCheckParse.parseArray(page, jsonArray);
                break;
            case STATISTICSDAY:
                this.statisticsDayParse.parseArray(page, jsonArray);
                break;
            default:
                break;
        }
    }
}
