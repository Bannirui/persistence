package com.rxy.persistence.consumer.scrapy.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rxy.persistence.consumer.scrapy.api.dal.dao.RpLoanStatisticsDayMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanStatisticsDay;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanStatisticsDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
@Service
public class RpLoanStatisticsDayServiceImpl extends ServiceImpl<RpLoanStatisticsDayMapper, RpLoanStatisticsDay> implements RpLoanStatisticsDayService {

    @Autowired
    private RpLoanStatisticsDayMapper rpLoanStatisticsDayMapper;

    /**
     * 主键自增 忽略字段id
     * @param rpLoanStatisticsDay
     * @return
     */
    @Override
    public int saveWithoutId(RpLoanStatisticsDay rpLoanStatisticsDay) {
        return this.rpLoanStatisticsDayMapper.saveWithoutId(rpLoanStatisticsDay);
    }
}
