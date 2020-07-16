package com.rxy.persistence.consumer.scrapy.api.crawl.request;

import com.alibaba.fastjson.JSON;
import com.rxy.persistence.consumer.scrapy.api.crawl.setting.ApiSetting;
import com.rxy.persistence.consumer.scrapy.statistics.dal.dto.PostDateDto;
import com.rxy.persistence.consumer.scrapy.statistics.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.model.HttpRequestBody;
import us.codecraft.webmagic.utils.HttpConstant;

import java.util.Date;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Component
public class ApiCustomizedRequest {

    @Autowired
    private ApiSetting apiSetting;

    public Request post() {

        // 请求日期参数
        String startTime = DateUtil.getBeforeOrAfterDateStr(new Date(), -3);
        String endTime = DateUtil.getBeforeOrAfterDateStr(new Date(), 0);

        // 显示处理非get请求
        Request request = new Request(this.apiSetting.getUrl());
        request.setMethod(HttpConstant.Method.POST);
        PostDateDto requestDateDto = PostDateDto.builder().startDate(startTime).endDate(endTime).build();
        String jsonStr = JSON.toJSON(requestDateDto).toString();
        request.setRequestBody(HttpRequestBody.json(jsonStr, "utf-8"));
        return request;
    }
}
