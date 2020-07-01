package com.rxy.persistence.consumer.task.crawl.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rxy.persistence.consumer.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.dal.entity.StatisticsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Json;
import us.codecraft.webmagic.selector.Selectable;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Component
public class ApiProcessor implements PageProcessor {

    @Autowired
    private ApiSetting apiSetting;

    @Autowired
    private ApiPipeline apiPipeline;

    private Site site = Site.me().setCharset("utf8").setTimeOut(10 * 1000).setRetrySleepTime(3 * 1000);

    /**
     * 解析网址内容
     *
     * @param page
     */
    @Override
    public void process(Page page) {
        // 根据采集响应结果获取到json格式数据 JSON转Java必须是最小粒度 不能有嵌套 因此一直get下去最终再转java entity
        // 是否需要对json对象先判空page.getJson();
        Json jsonResponse = page.getJson();
        String codeStr = jsonResponse.jsonPath("code").get();
        String messageStr = jsonResponse.jsonPath("message").get();
        String data = jsonResponse.jsonPath("data").get();

        /**
         * webmagic好像不支持链式调用jsonPath：page.getJson().jsonPath("data").jsonPath("persistenceVo")
         * 因此只使用一层jsonPath获取部分内容进行判断 之后转用fastjson转data为java
         */
        JSONArray rpLoanLabelBatchCheckListJson = JSONObject.parseObject(data).getJSONArray("rpLoanLabelBatchCheckList");
        JSONArray statisticsInfoListJson = JSONObject.parseObject(data).getJSONArray("statisticsInfoList");

        // 容器存储解析之后数据结果
        List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList = new ArrayList<RpLoanLabelBatchCheck>();
        List<StatisticsInfo> statisticsInfoList = new ArrayList<StatisticsInfo>();

        // 遍历array数组 json转java
        rpLoanLabelBatchCheckListJson.forEach(rpLoanLabelBatchCheckJson -> {
            RpLoanLabelBatchCheck rpLoanLabelBatchCheck = JSON.parseObject(rpLoanLabelBatchCheckJson.toString(), RpLoanLabelBatchCheck.class);
            rpLoanLabelBatchCheckList.add(rpLoanLabelBatchCheck);
        });

        statisticsInfoListJson.forEach(statisticsInfoJson -> {
            StatisticsInfo statisticsInfo = JSON.parseObject(statisticsInfoJson.toString(), StatisticsInfo.class);
            statisticsInfoList.add(statisticsInfo);
        });

        // put到page pipeline中get之后持久化
        page.putField("rpLoanLabelBatchCheckList", rpLoanLabelBatchCheckList);
        page.putField("statisticsInfoList", statisticsInfoList);
    }

    @Override
    public Site getSite() {
        return this.site;
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 1000 * 1000)
    public void process() {
        Spider.create(new ApiProcessor())
                .addUrl(this.apiSetting.getUrl())
                .thread(this.apiSetting.getThreads())
                .addPipeline(this.apiPipeline)
                .run();
    }
}
