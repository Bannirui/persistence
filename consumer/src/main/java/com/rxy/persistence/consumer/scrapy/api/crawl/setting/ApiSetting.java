package com.rxy.persistence.consumer.scrapy.api.crawl.setting;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Configuration
@Data
public class ApiSetting {
    /**
     * 采集目标网址
     */
    @Value("${app.fetch.api.url}")
    private String url;

    /**
     * 线程数
     */
    @Value("${app.fetch.api.threads}")
    private Integer threads;

    /**
     * timeout单位：秒
     */
    @Value("${app.fetch.api.timeoutSeconds}")
    private Integer timeoutSeconds;

    /**
     * 重试间隔时间 单位：秒
     */
    @Value("${app.fetch.api.retrySleepSeconds}")
    private Integer retrySleepSeconds;
}
