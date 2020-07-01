package com.rxy.persistence.consumer.task.crawl.demo;

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
    @Value("${app.fetch.demo.url}")
    private String url;

    /**
     * 线程数
     */
    @Value("${app.fetch.demo.threads}")
    private Integer threads;
}
