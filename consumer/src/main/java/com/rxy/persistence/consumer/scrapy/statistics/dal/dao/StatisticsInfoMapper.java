package com.rxy.persistence.consumer.scrapy.statistics.dal.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rxy.persistence.consumer.scrapy.statistics.dal.entity.StatisticsInfo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
@DS("statistics_info")
public interface StatisticsInfoMapper extends BaseMapper<StatisticsInfo> {

    /**
     * 主键自增 忽略字段id
     * @param statisticsInfo
     * @return
     */
    int saveWithoutId(StatisticsInfo statisticsInfo);
}
