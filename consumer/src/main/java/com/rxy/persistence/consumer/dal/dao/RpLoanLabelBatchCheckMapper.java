package com.rxy.persistence.consumer.dal.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.rxy.persistence.consumer.dal.entity.RpLoanLabelBatchCheck;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
@DS("api")
public interface RpLoanLabelBatchCheckMapper extends BaseMapper<RpLoanLabelBatchCheck> {

    /**
     * 主键自增 忽略字段id
     * @param rpLoanLabelBatchCheck
     * @return
     */
    int saveWithoutId(RpLoanLabelBatchCheck rpLoanLabelBatchCheck);
}
