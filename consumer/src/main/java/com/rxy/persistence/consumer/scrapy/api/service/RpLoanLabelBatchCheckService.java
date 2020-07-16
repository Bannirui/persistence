package com.rxy.persistence.consumer.scrapy.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelBatchCheck;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public interface RpLoanLabelBatchCheckService extends IService<RpLoanLabelBatchCheck> {

    /**
     * 主键自增 忽略字段id
     * @param rpLoanLabelBatchCheck
     * @return
     */
    int saveWithoutId(RpLoanLabelBatchCheck rpLoanLabelBatchCheck);
}
