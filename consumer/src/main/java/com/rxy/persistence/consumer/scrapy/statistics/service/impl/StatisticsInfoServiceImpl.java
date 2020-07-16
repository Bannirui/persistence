package com.rxy.persistence.consumer.scrapy.statistics.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rxy.persistence.consumer.scrapy.statistics.dal.dao.StatisticsInfoMapper;
import com.rxy.persistence.consumer.scrapy.statistics.dal.entity.StatisticsInfo;
import com.rxy.persistence.consumer.scrapy.statistics.service.StatisticsInfoService;
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
public class StatisticsInfoServiceImpl extends ServiceImpl<StatisticsInfoMapper, StatisticsInfo> implements StatisticsInfoService {

    @Autowired
    private StatisticsInfoMapper statisticsInfoMapper;

    /**
     * 主键自增 忽略字段id
     * @param statisticsInfo
     * @return
     */
    @Override
    public int saveWithoutId(StatisticsInfo statisticsInfo) {
        return this.statisticsInfoMapper.saveWithoutId(statisticsInfo);
    }
}
