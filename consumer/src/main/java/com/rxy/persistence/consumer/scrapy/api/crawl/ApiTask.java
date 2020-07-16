package com.rxy.persistence.consumer.scrapy.api.crawl;

import com.rxy.persistence.consumer.scrapy.api.crawl.crawler.ApiProcessor;
import com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.ApiPipeline;
import com.rxy.persistence.consumer.scrapy.api.crawl.request.ApiCustomizedRequest;
import com.rxy.persistence.consumer.scrapy.api.crawl.setting.ApiSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Spider;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Component
public class ApiTask {

    /**
     * 项目配置
     */
    @Autowired
    private ApiSetting apiSetting;

    @Autowired
    private ApiProcessor apiProcessor;

    @Autowired
    private ApiPipeline apiPipeline;

    @Autowired
    private ApiCustomizedRequest apiCustomizedRequest;

    // 创建线程池
    private ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();

    public void crawl() {
        // 定时任务
        timer.scheduleWithFixedDelay(() -> {
            // 设置线程名
            Thread.currentThread().setName("ApiCrawlerThread");

            // 设置的请求request加入到page中
            Spider.create(this.apiProcessor)
                    .addRequest(apiCustomizedRequest.post())
                    .addPipeline(this.apiPipeline)
                    .thread(this.apiSetting.getThreads())
                    .start();
        }, 0, 10, TimeUnit.SECONDS);
    }

    /**
     * cron = "0/10 0 0-23 * * ?" 每天0-23点 每10秒触发一次
     * cron = "0 0/30 0-23 * * ?" 每天0-23点 每30分钟触发一次 避免因为日期问题导致数据重复
     */
    @Scheduled(cron = "0/10 * * * * ?")  // 开发环境
    // @Scheduled(cron = "0 0/30 0-23 * * ?")  // 正式环境
    public void crawlWithSchedule() {
        // 设置的请求request加入到page中
        Spider.create(this.apiProcessor)
                .addRequest(this.apiCustomizedRequest.post())
                .addPipeline(this.apiPipeline)
                .thread(this.apiSetting.getThreads())
                .start();
    }
}
