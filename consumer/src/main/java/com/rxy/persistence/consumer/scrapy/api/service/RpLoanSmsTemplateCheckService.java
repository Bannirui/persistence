package com.rxy.persistence.consumer.scrapy.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanSmsTemplateCheck;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface RpLoanSmsTemplateCheckService extends IService<RpLoanSmsTemplateCheck> {

    /**
     * 主键自增 忽略字段id
     * @param rpLoanSmsTemplateCheck
     * @return
     */
    int saveWithoutId(RpLoanSmsTemplateCheck rpLoanSmsTemplateCheck);

    /**
     * 根据日期时间删除
     * @param startTime
     * @param endTime
     * @return
     */
    int deleteByTime(String startTime, String endTime);
}
