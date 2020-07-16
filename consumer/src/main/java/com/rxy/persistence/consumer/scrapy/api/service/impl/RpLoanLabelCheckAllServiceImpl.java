package com.rxy.persistence.consumer.scrapy.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rxy.persistence.consumer.scrapy.api.dal.dao.RpLoanLabelCheckAllMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelCheckAll;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelCheckAllService;
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
public class RpLoanLabelCheckAllServiceImpl extends ServiceImpl<RpLoanLabelCheckAllMapper, RpLoanLabelCheckAll> implements RpLoanLabelCheckAllService {

    @Autowired
    private RpLoanLabelCheckAllMapper rpLoanLabelCheckAllMapper;

    /**
     * 主键自增 忽略字段id
     * @param rpLoanLabelCheckAll
     * @return
     */
    @Override
    public int saveWithoutId(RpLoanLabelCheckAll rpLoanLabelCheckAll) {
        return this.rpLoanLabelCheckAllMapper.saveWithoutId(rpLoanLabelCheckAll);
    }
}
