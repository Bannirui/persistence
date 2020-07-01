package com.rxy.persistence.consumer.dal.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.rxy.persistence.consumer.dal.entity.StatisticsInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

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

}
