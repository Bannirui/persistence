package com.rxy.persistence.consumer.scrapy.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rxy.persistence.consumer.scrapy.api.dal.dao.RpLoanLabelCheckMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelCheck;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanLabelCheckService;
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
public class RpLoanLabelCheckServiceImpl extends ServiceImpl<RpLoanLabelCheckMapper, RpLoanLabelCheck> implements RpLoanLabelCheckService {

    @Autowired
    private RpLoanLabelCheckMapper rpLoanLabelCheckMapper;

    /**
     * 主键自增 忽略字段id
     * @param rpLoanLabelCheck
     * @return
     */
    @Override
    public int saveWithoutId(RpLoanLabelCheck rpLoanLabelCheck) {
        return this.rpLoanLabelCheckMapper.saveWithoutId(rpLoanLabelCheck);
    }

    /**
     * 根据日期时间删除
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    public int deleteByTime(String startTime, String endTime) {
        return this.rpLoanLabelCheckMapper.deleteByTime(startTime, endTime);
    }
}
