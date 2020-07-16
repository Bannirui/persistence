package com.rxy.persistence.consumer.scrapy.api.crawl.crawler;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rxy.persistence.consumer.scrapy.api.crawl.crawler.parse.ParseFactory;
import com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.ApiPipeline;
import com.rxy.persistence.consumer.scrapy.api.crawl.setting.ApiSetting;
import com.rxy.persistence.consumer.scrapy.api.dal.enumerate.TableNameEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Json;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Component
@Slf4j
public class ApiProcessor implements PageProcessor {

    @Autowired
    private ApiSetting apiSetting;

    @Autowired
    private ApiPipeline apiPipeline;

    @Autowired
    private ParseFactory parseFactory;

    /**
     * 解析网址内容
     *
     * @param page
     */
    @Override
    public void process(Page page) {
        log.info("[+] api 数据开始采集");
        // 根据采集响应结果获取到json格式数据 JSON转Java必须是最小粒度 不能有嵌套 因此一直get下去最终再转java entity
        // 是否需要对json对象先判空page.getJson();
        Json jsonResponse = page.getJson();
        // 接口json返回判空
        if (jsonResponse == null) {
            log.error("[-] api 接口返回为空");
            return;
        }

        log.info("[+] api 接口json数据格式>>>");
        log.info(jsonResponse.toString());

        // 接口返回json不为空 但是结构不对 没有code这个key
        String codeStr;
        try {
            codeStr = jsonResponse.jsonPath("code").get();
        } catch (Exception e) {
            // get不到code这个key
            log.error("[-] api 接口返回格式有误>>>没有code键");
            return;
        }
        // codeStr格式验证以及转整数后正确性验证
        int code;
        try {
            code = Integer.parseInt(codeStr);
        } catch (Exception e) {
            // code格式不正确
            log.error("[-] api 接口返回状态码有误>>>code对应的value为[{}]", codeStr);
            return;
        }
        // 判断code状态码值是否为200
        if (200 != code) {
            // code状态码值有误 不是200
            log.error("[-] api 接口返回状态码有误>>>code值不是200而是[{}]", code);
            return;
        }

        // 取出data
        String data;
        try {
            data = jsonResponse.jsonPath("data").get();
        } catch (Exception e) {
            // get不到data这个key
            log.error("[-] api 接口返回格式有误>>>没有data键");
            return;
        }

        // 校验data的json字符串是否为空
        if (StringUtils.isBlank(data)) {
            // data对应的value为空
            log.error("[-] api 接口返回data对应值数据为空");
            return;
        }

        /**
         * webmagic好像不支持链式调用jsonPath：page.getJson().jsonPath("data").jsonPath("persistenceVo")
         * 因此只使用一层jsonPath获取部分内容进行判断 之后转用fastjson转data为java
         */

        // key名称列表
        for (TableNameEnum tableNameEnum : TableNameEnum.values()) {
            // 以tableName为key 对json进行get
            String tableName = tableNameEnum.getName();

            // 以名称为key get 如果没有key则跳过
            JSONArray perKeyStatisticsInfoListJson;
            try {
                perKeyStatisticsInfoListJson = JSONObject.parseObject(data).getJSONArray(tableName);
            } catch (Exception e) {
                // data对应的value为空
                log.error("[-] statistics 接口返回data数组中没有[{}]该key", tableName);
                continue;
            }

            // 有key 但是key值为空
            if (perKeyStatisticsInfoListJson == null) {
                // data对应的value为空
                log.error("[-] statistics 接口返回data数组中[{}]该key数据为空", tableName);
                continue;
            }

            // 5种类型数据统一接口 get到的json数组交给接口处理
            this.parseFactory.createParser(tableNameEnum, page, perKeyStatisticsInfoListJson);
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
                .setTimeOut(this.apiSetting.getTimeoutSeconds() * 1000)
                .setRetrySleepTime(this.apiSetting.getRetrySleepSeconds() * 1000);
    }

}
