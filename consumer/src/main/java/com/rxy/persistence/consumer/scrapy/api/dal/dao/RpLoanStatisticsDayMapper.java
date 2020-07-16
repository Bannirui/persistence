package com.rxy.persistence.consumer.scrapy.api.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanStatisticsDay;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface RpLoanStatisticsDayMapper extends BaseMapper<RpLoanStatisticsDay> {

    /**
     * 主键自增 忽略字段id
     * @param rpLoanStatisticsDay
     * @return
     */
    int saveWithoutId(RpLoanStatisticsDay rpLoanStatisticsDay);
}
