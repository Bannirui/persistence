package com.rxy.persistence.consumer.scrapy.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelCheck;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface RpLoanLabelCheckService extends IService<RpLoanLabelCheck> {

    /**
     * 主键自增 忽略字段id
     * @param rpLoanLabelCheck
     * @return
     */
    int saveWithoutId(RpLoanLabelCheck rpLoanLabelCheck);

    /**
     * 根据日期时间删除
     * @param startTime
     * @param endTime
     * @return
     */
    int deleteByTime(String startTime, String endTime);
}
