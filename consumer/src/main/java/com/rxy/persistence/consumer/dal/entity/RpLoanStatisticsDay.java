package com.rxy.persistence.consumer.dal.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dingrui
 * @since 2020-06-30
 */
public class RpLoanStatisticsDay implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String date;

    private Long uv;

    private String test;

    private String ipRealSuccRate;

    private Long subSuccess;

    private Long pv;

    private Long ip;

    private String unknownSendRate;

    private String failSendRate;

    private String label;

    private String operator;

    private String bank;

    private Long sendFail;

    private String createTime;

    private Long sendUnknow;

    private String sms;

    private Long sendSuccess;

    private Long send;

    private String ipSuccRate;

    private String channelId;

    private String hand;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getUv() {
        return uv;
    }

    public void setUv(Long uv) {
        this.uv = uv;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getIpRealSuccRate() {
        return ipRealSuccRate;
    }

    public void setIpRealSuccRate(String ipRealSuccRate) {
        this.ipRealSuccRate = ipRealSuccRate;
    }

    public Long getSubSuccess() {
        return subSuccess;
    }

    public void setSubSuccess(Long subSuccess) {
        this.subSuccess = subSuccess;
    }

    public Long getPv() {
        return pv;
    }

    public void setPv(Long pv) {
        this.pv = pv;
    }

    public Long getIp() {
        return ip;
    }

    public void setIp(Long ip) {
        this.ip = ip;
    }

    public String getUnknownSendRate() {
        return unknownSendRate;
    }

    public void setUnknownSendRate(String unknownSendRate) {
        this.unknownSendRate = unknownSendRate;
    }

    public String getFailSendRate() {
        return failSendRate;
    }

    public void setFailSendRate(String failSendRate) {
        this.failSendRate = failSendRate;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Long getSendFail() {
        return sendFail;
    }

    public void setSendFail(Long sendFail) {
        this.sendFail = sendFail;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getSendUnknow() {
        return sendUnknow;
    }

    public void setSendUnknow(Long sendUnknow) {
        this.sendUnknow = sendUnknow;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public Long getSendSuccess() {
        return sendSuccess;
    }

    public void setSendSuccess(Long sendSuccess) {
        this.sendSuccess = sendSuccess;
    }

    public Long getSend() {
        return send;
    }

    public void setSend(Long send) {
        this.send = send;
    }

    public String getIpSuccRate() {
        return ipSuccRate;
    }

    public void setIpSuccRate(String ipSuccRate) {
        this.ipSuccRate = ipSuccRate;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "RpLoanStatisticsDay{" +
        "id=" + id +
        ", date=" + date +
        ", uv=" + uv +
        ", test=" + test +
        ", ipRealSuccRate=" + ipRealSuccRate +
        ", subSuccess=" + subSuccess +
        ", pv=" + pv +
        ", ip=" + ip +
        ", unknownSendRate=" + unknownSendRate +
        ", failSendRate=" + failSendRate +
        ", label=" + label +
        ", operator=" + operator +
        ", bank=" + bank +
        ", sendFail=" + sendFail +
        ", createTime=" + createTime +
        ", sendUnknow=" + sendUnknow +
        ", sms=" + sms +
        ", sendSuccess=" + sendSuccess +
        ", send=" + send +
        ", ipSuccRate=" + ipSuccRate +
        ", channelId=" + channelId +
        ", hand=" + hand +
        "}";
    }
}
