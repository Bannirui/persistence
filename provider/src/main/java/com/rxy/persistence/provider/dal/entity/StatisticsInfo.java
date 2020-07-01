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
 * @since 2020-06-30
 */
public class StatisticsInfo implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
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

    private Integer sendNum;

    private Integer sendSuccess;

    private Integer sendFail;

    private Integer sendUnknown;

    private Integer pv;

    private Integer uv;

    private Integer ip;

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

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
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

    public Integer getSendNum() {
        return sendNum;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }

    public Integer getSendSuccess() {
        return sendSuccess;
    }

    public void setSendSuccess(Integer sendSuccess) {
        this.sendSuccess = sendSuccess;
    }

    public Integer getSendFail() {
        return sendFail;
    }

    public void setSendFail(Integer sendFail) {
        this.sendFail = sendFail;
    }

    public Integer getSendUnknown() {
        return sendUnknown;
    }

    public void setSendUnknown(Integer sendUnknown) {
        this.sendUnknown = sendUnknown;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getIp() {
        return ip;
    }

    public void setIp(Integer ip) {
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
