package com.rxy.persistence.provider.vo;

import com.rxy.persistence.provider.dal.entity.*;
import lombok.Data;

import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Data
public class ApiVo {
    private List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList;
    private List<RpLoanLabelCheckAll> rpLoanLabelCheckAllList;
    private List<RpLoanLabelCheck> rpLoanLabelCheckList;
    private List<RpLoanSmsTemplateCheck> rpLoanSmsTemplateCheckList;
    private List<RpLoanStatisticsDay> rpLoanStatisticsDayList;
}
