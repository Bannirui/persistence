package com.rxy.persistence.consumer.scrapy.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rxy.persistence.consumer.scrapy.api.dal.dao.RpLoanLabelBatchCheckMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelBatchCheckService;
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
public class RpLoanLabelBatchCheckServiceImpl extends ServiceImpl<RpLoanLabelBatchCheckMapper, RpLoanLabelBatchCheck> implements RpLoanLabelBatchCheckService {

    @Autowired
    private RpLoanLabelBatchCheckMapper rpLoanLabelBatchCheckMapper;

    /**
     * 主键自增 忽略字段id
     * @param rpLoanLabelBatchCheck
     * @return
     */
    @Override
    public int saveWithoutId(RpLoanLabelBatchCheck rpLoanLabelBatchCheck) {
        return this.rpLoanLabelBatchCheckMapper.saveWithoutId(rpLoanLabelBatchCheck);
    }
}
