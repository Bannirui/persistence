package com.rxy.persistence.consumer.service.impl;

import com.rxy.persistence.consumer.dal.dao.RpLoanLabelCheckMapper;
import com.rxy.persistence.consumer.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.dal.dao.RpLoanLabelBatchCheckMapper;
import com.rxy.persistence.consumer.service.RpLoanLabelBatchCheckService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
