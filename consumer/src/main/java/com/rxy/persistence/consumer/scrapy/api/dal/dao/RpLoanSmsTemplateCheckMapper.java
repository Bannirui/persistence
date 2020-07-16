package com.rxy.persistence.consumer.scrapy.api.dal.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanSmsTemplateCheck;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface RpLoanSmsTemplateCheckMapper extends BaseMapper<RpLoanSmsTemplateCheck> {

    /**
     * 主键自增 忽略字段id
     *
     * @param rpLoanSmsTemplateCheck
     * @return
     */
    int saveWithoutId(RpLoanSmsTemplateCheck rpLoanSmsTemplateCheck);

    /**
     * 根据日期时间删除
     *
     * @param startTime
     * @param endTime
     * @return
     */
    int deleteByTime(@Param("startTime") String startTime, @Param("endTime") String endTime);
}
