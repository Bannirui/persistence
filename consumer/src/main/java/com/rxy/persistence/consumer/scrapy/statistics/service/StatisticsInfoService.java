package com.rxy.persistence.consumer.scrapy.statistics.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rxy.persistence.consumer.scrapy.statistics.dal.entity.StatisticsInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface StatisticsInfoService extends IService<StatisticsInfo> {

    /**
     * 主键自增 忽略字段id
     * @param statisticsInfo
     * @return
     */
    int saveWithoutId(StatisticsInfo statisticsInfo);
}
