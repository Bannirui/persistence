package com.rxy.persistence.consumer;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.rxy.persistence.consumer.scrapy.api.crawl.ApiTask;
import com.rxy.persistence.consumer.scrapy.statistics.crawl.StatisticsTask;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.rxy.persistence.consumer.scrapy.*.dal.dao")
@EnableScheduling
public class PersistenceConsumerApplication implements CommandLineRunner {

    @Autowired
    private ApiTask apiTask;

    @Autowired
    private StatisticsTask statisticsTask;

    public static void main(String[] args) {
        SpringApplication.run(PersistenceConsumerApplication.class, args);
    }

    /**
     * 实现接口CommandLineRunner
     * 调度任务执行 通过定时线程池实现定时执行任务 但是实现逻辑中：根据日期获取数据->根据日期删除数据->保存数据
     * 如果刚好日期跨界发生在删除后保存前 会导致有数据重复 并且删除不掉
     * 因此改用scheduled通过cron表达式限制执行时间
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        // api 开启爬取任务
        // this.apiTask.crawl();

        // statistic 开启爬取任务
        // this.statisticsTask.crawl();
    }
}
