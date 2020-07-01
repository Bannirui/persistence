package com.rxy.persistence.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.rxy.persistence.provider.dal.dao")
public class PersistenceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersistenceProviderApplication.class, args);
    }
}
