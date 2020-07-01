package com.rxy.persistence.consumer.dal.entity;

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
public class StatisticsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String sendDate;

    private String product;

    private String label;

    private Integer operator;

    private String channelName;

    private String channelId;

    private String province;

    private String domain;

    private String smsContent;

    private Long sendNum;

    private Long sendSuccess;

    private Long sendFail;

    private Long sendUnknown;

    private Long pv;

    private Long uv;

    private Long ip;

    private String createTime;

    private String updateTime;

    public StatisticsInfo entityWithoutId() {
        return StatisticsInfo.builder()
                .sendDate(this.sendDate)
                .product(this.product)
                .label(this.label)
                .operator(this.operator)
                .channelName(this.channelName)
                .channelId(this.channelId)
                .province(this.province)
                .domain(this.domain)
                .smsContent(this.smsContent)
                .sendNum(this.sendNum)
                .sendSuccess(this.sendSuccess)
                .sendFail(this.sendFail)
                .sendUnknown(this.sendUnknown)
                .pv(this.pv)
                .uv(this.uv)
                .ip(this.ip)
                .createTime(this.createTime)
                .updateTime(this.updateTime)
                .build();
    }
}
