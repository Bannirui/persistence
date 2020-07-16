package com.rxy.persistence.consumer.scrapy.statistics.crawl;

import com.rxy.persistence.consumer.scrapy.statistics.crawl.crawler.StatisticsProcessor;
import com.rxy.persistence.consumer.scrapy.statistics.crawl.pipeline.StatisticsPipeline;
import com.rxy.persistence.consumer.scrapy.statistics.crawl.request.StatisticsCustomizedRequest;
import com.rxy.persistence.consumer.scrapy.statistics.crawl.setting.StatisticsSetting;
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
public class StatisticsTask {

    /**
     * 项目配置
     */
    @Autowired
    private StatisticsSetting statisticsSetting;

    @Autowired
    private StatisticsProcessor statisticsProcessor;

    @Autowired
    private StatisticsPipeline statisticsPipeline;

    @Autowired
    private StatisticsCustomizedRequest statisticsCustomizedRequest;

    // 创建线程池
    private ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor();

    public void crawl() {
        // 定时任务
        timer.scheduleWithFixedDelay(() -> {
            // 设置线程名
            Thread.currentThread().setName("Statistics-Crawler-Thread");

            // 设置的请求request加入到page中
            Spider.create(this.statisticsProcessor)
                    .addRequest(this.statisticsCustomizedRequest.post())
                    .addPipeline(this.statisticsPipeline)
                    .thread(this.statisticsSetting.getThreads())
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
        Spider.create(this.statisticsProcessor)
                .addRequest(this.statisticsCustomizedRequest.post())
                .addPipeline(this.statisticsPipeline)
                .thread(this.statisticsSetting.getThreads())
                .start();
    }
}
