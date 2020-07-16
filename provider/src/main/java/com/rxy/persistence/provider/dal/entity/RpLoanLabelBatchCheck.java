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
public class RpLoanLabelBatchCheck implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String isDelete;

    private String bankName;

    private String label;

    private String longMsg;

    private String sync;

    private String bank;

    private String createTime;

    private String enable;

    private String sms;

    private String alias;

    private String verify;

    private String channelName;

    private String labelName;

    private String channelId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLongMsg() {
        return longMsg;
    }

    public void setLongMsg(String longMsg) {
        this.longMsg = longMsg;
    }

    public String getSync() {
        return sync;
    }

    public void setSync(String sync) {
        this.sync = sync;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "RpLoanLabelBatchCheck{" +
        "id=" + id +
        ", isDelete=" + isDelete +
        ", bankName=" + bankName +
        ", label=" + label +
        ", longMsg=" + longMsg +
        ", sync=" + sync +
        ", bank=" + bank +
        ", createTime=" + createTime +
        ", enable=" + enable +
        ", sms=" + sms +
        ", alias=" + alias +
        ", verify=" + verify +
        ", channelName=" + channelName +
        ", labelName=" + labelName +
        ", channelId=" + channelId +
        "}";
    }
}
