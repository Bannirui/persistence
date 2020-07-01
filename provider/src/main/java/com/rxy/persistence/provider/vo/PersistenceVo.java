package com.rxy.persistence.provider.vo;

import com.rxy.persistence.provider.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.provider.dal.entity.StatisticsInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersistenceVo {
    private List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList;
    private List<StatisticsInfo> statisticsInfoList;
}
