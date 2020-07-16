package com.rxy.persistence.consumer.scrapy.statistics.crawl.crawler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rxy.persistence.consumer.scrapy.statistics.crawl.setting.StatisticsSetting;
import com.rxy.persistence.consumer.scrapy.statistics.dal.entity.StatisticsInfo;
import com.rxy.persistence.consumer.scrapy.statistics.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Slf4j
@Component
public class StatisticsProcessor implements PageProcessor {

    @Autowired
    private StatisticsSetting statisticsSetting;

    /**
     * 解析网址内容
     *
     * @param page
     */
    @Override
    public void process(Page page) {
        log.info("[+] statistics 数据开始采集");
        // 根据采集响应结果获取到json格式数据 JSON转Java必须是最小粒度 不能有嵌套 因此一直get下去最终再转java entity
        // 是否需要对json对象先判空page.getJson();
        Json jsonResponse = page.getJson();
        // 接口json返回判空
        if (jsonResponse == null) {
            log.error("[-] statistics 接口返回为空");
            return;
        }

        log.info("[+] statistics 接口json数据格式>>>");
        log.info(jsonResponse.toString());

        // 接口返回json不为空 但是结构不对 没有code这个key
        String codeStr;
        try {
            codeStr = jsonResponse.jsonPath("code").get();
        } catch (Exception e) {
            // get不到code这个key
            log.error("[-] statistics 接口返回格式有误>>>没有code键");
            return;
        }
        // codeStr格式验证以及转整数后正确性验证
        int code;
        try {
            code = Integer.parseInt(codeStr);
        } catch (Exception e) {
            // code格式不正确
            log.error("[-] statistics 接口返回状态码有误>>>code对应的value为[{}]", codeStr);
            return;
        }
        // 判断code状态码值是否为200
        if (200 != code) {
            // code状态码值有误 不是200
            log.error("[-] statistics 接口返回状态码有误>>>code值不是200而是[{}]", code);
            return;
        }

        // 取出data
        String data;
        try {
            data = jsonResponse.jsonPath("data").get();
        } catch (Exception e) {
            // get不到data这个key
            log.error("[-] statistics 接口返回格式有误>>>没有data键");
            return;
        }

        // 校验data的json字符串是否为空
        if (StringUtils.isBlank(data)) {
            // data对应的value为空
            log.error("[-] statistics 接口返回data对应值数据为空");
            return;
        }

        /**
         * webmagic好像不支持链式调用jsonPath：page.getJson().jsonPath("data").jsonPath("persistenceVo")
         * 因此只使用一层jsonPath获取部分内容进行判断 之后转用fastjson转data为java
         */

        // 获取startTime->endTime的列表 作为key遍历 为当前时间往前推 近7天
        List<String> dateStrList = DateUtil.getDateStrList(new Date(), -7);
        for (String dateStr : dateStrList) {
            // 以日期为key get 如果没有key则跳过
            JSONArray dailyStatisticsInfoListJson;
            try {
                dailyStatisticsInfoListJson = JSONObject.parseObject(data).getJSONArray(dateStr);
            } catch (Exception e) {
                // data对应的value为空
                log.error("[-] statistics 接口返回data数组中没有[{}]该key", dateStr);
                continue;
            }

            // 有key 但是key值为空
            if (dailyStatisticsInfoListJson == null) {
                // data对应的value为空
                log.error("[-] statistics 接口返回data数组中[{}]该key数据为空", dateStr);
                continue;
            }

            // 容器存储解析之后数据结果
            List<StatisticsInfo> statisticsInfoList = new ArrayList<StatisticsInfo>();

            // 遍历array数组 json转java
            dailyStatisticsInfoListJson.forEach(statisticsInfoJson -> {
                StatisticsInfo statisticsInfo = JSON.parseObject(statisticsInfoJson.toString(), StatisticsInfo.class);
                statisticsInfoList.add(statisticsInfo);
            });

            // put到page pipeline中get之后持久化 以日期字符串做为key 比如：2020-01-01
            page.putField(dateStr, statisticsInfoList);
        }
    }

    @Override
    public Site getSite() {
        return this.site();
    }

    /**
     * 定制site
     *
     * @return
     */
    private Site site() {
        return Site
                .me()
                .setCharset("utf8")
                .setTimeOut(this.statisticsSetting.getTimeoutSeconds() * 1000)
                .setRetrySleepTime(this.statisticsSetting.getRetrySleepSeconds() * 1000);
    }

}
