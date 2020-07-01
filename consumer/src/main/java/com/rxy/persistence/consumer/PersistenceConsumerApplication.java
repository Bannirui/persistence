package com.rxy.persistence.consumer;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@EnableScheduling
@MapperScan("com.rxy.persistence.consumer.dal.dao")
public class PersistenceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersistenceConsumerApplication.class, args);
    }
}
