package com.rxy.persistence.consumer.scrapy.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rxy.persistence.consumer.scrapy.api.dal.dao.RpLoanSmsTemplateCheckMapper;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanSmsTemplateCheck;
import com.rxy.persistence.consumer.scrapy.api.service.RpLoanSmsTemplateCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
@Service
public class RpLoanSmsTemplateCheckServiceImpl extends ServiceImpl<RpLoanSmsTemplateCheckMapper, RpLoanSmsTemplateCheck> implements RpLoanSmsTemplateCheckService {

    @Autowired
    private RpLoanSmsTemplateCheckMapper rpLoanSmsTemplateCheckMapper;

    /**
     * 主键自增 忽略字段id
     *
     * @param rpLoanSmsTemplateCheck
     * @return
     */
    @Override
    public int saveWithoutId(RpLoanSmsTemplateCheck rpLoanSmsTemplateCheck) {
        return this.rpLoanSmsTemplateCheckMapper.saveWithoutId(rpLoanSmsTemplateCheck);
    }

    /**
     * 根据日期时间删除
     *
     * @param startTime
     * @param endTime
     * @return
     */
    @Override
    public int deleteByTime(String startTime, String endTime) {
        return this.rpLoanSmsTemplateCheckMapper.deleteByTime(startTime, endTime);
    }
}
