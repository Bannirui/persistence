package com.rxy.persistence.consumer.scrapy.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanStatisticsDay;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface RpLoanStatisticsDayService extends IService<RpLoanStatisticsDay> {

    /**
     * 主键自增 忽略字段id
     * @param rpLoanStatisticsDay
     * @return
     */
    int saveWithoutId(RpLoanStatisticsDay rpLoanStatisticsDay);
}
