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
public class StatisticsInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String sendDate;

    private String product;

    private String label;

    private String operator;

    private String channelName;

    private String channelId;

    private String province;

    private String domain;

    private String smsContent;

    private String sendNum;

    private String sendSuccess;

    private String sendFail;

    private String sendUnknown;

    private String pv;

    private String uv;

    private String ip;

    private String createTime;

    private String updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public String getSendNum() {
        return sendNum;
    }

    public void setSendNum(String sendNum) {
        this.sendNum = sendNum;
    }

    public String getSendSuccess() {
        return sendSuccess;
    }

    public void setSendSuccess(String sendSuccess) {
        this.sendSuccess = sendSuccess;
    }

    public String getSendFail() {
        return sendFail;
    }

    public void setSendFail(String sendFail) {
        this.sendFail = sendFail;
    }

    public String getSendUnknown() {
        return sendUnknown;
    }

    public void setSendUnknown(String sendUnknown) {
        this.sendUnknown = sendUnknown;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "StatisticsInfo{" +
        "id=" + id +
        ", sendDate=" + sendDate +
        ", product=" + product +
        ", label=" + label +
        ", operator=" + operator +
        ", channelName=" + channelName +
        ", channelId=" + channelId +
        ", province=" + province +
        ", domain=" + domain +
        ", smsContent=" + smsContent +
        ", sendNum=" + sendNum +
        ", sendSuccess=" + sendSuccess +
        ", sendFail=" + sendFail +
        ", sendUnknown=" + sendUnknown +
        ", pv=" + pv +
        ", uv=" + uv +
        ", ip=" + ip +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
