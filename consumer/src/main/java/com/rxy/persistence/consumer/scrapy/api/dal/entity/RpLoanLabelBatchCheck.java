package com.rxy.persistence.consumer.scrapy.api.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RpLoanLabelBatchCheck implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long isDelete;

    private String bankName;

    private String label;

    private Long longMsg;

    private Long sync;

    private String bank;

    private String createTime;

    private Long enable;

    private String sms;

    private String alias;

    private Long verify;

    private String channelName;

    private String labelName;

    private Long channelId;

    public RpLoanLabelBatchCheck entityWithoutId() {
        return RpLoanLabelBatchCheck.builder()
                .isDelete(this.isDelete)
                .bankName(this.bankName)
                .label(this.label)
                .longMsg(this.longMsg)
                .sync(this.sync)
                .bank(this.bank)
                .createTime(this.createTime)
                .enable(this.enable)
                .sms(this.sms)
                .alias(this.alias)
                .verify(this.verify)
                .channelName(this.channelName)
                .labelName(this.labelName)
                .channelId(this.channelId)
                .build();
    }
}
