package com.rxy.persistence.consumer.scrapy.api.dal.enumerate;

import lombok.Getter;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
@Getter
public enum TableNameEnum {

    BATCHCHECK("rpLoanLabelBatchCheckList", "rpLoanLabelBatchCheckList"),
    CHECKALL("rpLoanLabelCheckAllList", "rpLoanLabelCheckAllList"),
    CHECK("rpLoanLabelCheckList", "rpLoanLabelCheckList"),
    TEMPLATECHECK("rpLoanSmsTemplateCheckList", "rpLoanSmsTemplateCheckList"),
    STATISTICSDAY("rpLoanStatisticsDayList", "rpLoanStatisticsDayList");

    private String name;
    private String desc;

    TableNameEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
