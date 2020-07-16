package com.rxy.persistence.provider.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dingrui
 * @since 2020-07-01
 */
public class RpLoanStatisticsDay implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String date;

    private String uv;

    private String test;

    private String ipRealSuccRate;

    private String subSuccess;

    private String pv;

    private String ip;

    private String unknownSendRate;

    private String failSendRate;

    private String label;

    private String operator;

    private String bank;

    private String sendFail;

    private String createTime;

    private String sendUnknow;

    private String sms;

    private String sendSuccess;

    private String send;

    private String ipSuccRate;

    private String channelId;

    private String hand;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
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

    public String getSubSuccess() {
        return subSuccess;
    }

    public void setSubSuccess(String subSuccess) {
        this.subSuccess = subSuccess;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
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

    public String getSendFail() {
        return sendFail;
    }

    public void setSendFail(String sendFail) {
        this.sendFail = sendFail;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSendUnknow() {
        return sendUnknow;
    }

    public void setSendUnknow(String sendUnknow) {
        this.sendUnknow = sendUnknow;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getSendSuccess() {
        return sendSuccess;
    }

    public void setSendSuccess(String sendSuccess) {
        this.sendSuccess = sendSuccess;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
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
