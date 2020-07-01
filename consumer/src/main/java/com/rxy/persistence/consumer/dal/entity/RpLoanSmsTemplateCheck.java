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
public class RpLoanSmsTemplateCheck implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String template;

    private String bank;

    private String modifyTime;

    private String extNo;

    private String createTime;

    private Long enable;

    private Long verify;

    private String bankName;

    private Long sync;

    private String channelId;

    private String operator;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getExtNo() {
        return extNo;
    }

    public void setExtNo(String extNo) {
        this.extNo = extNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public Long getVerify() {
        return verify;
    }

    public void setVerify(Long verify) {
        this.verify = verify;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Long getSync() {
        return sync;
    }

    public void setSync(Long sync) {
        this.sync = sync;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "RpLoanSmsTemplateCheck{" +
        "id=" + id +
        ", template=" + template +
        ", bank=" + bank +
        ", modifyTime=" + modifyTime +
        ", extNo=" + extNo +
        ", createTime=" + createTime +
        ", enable=" + enable +
        ", verify=" + verify +
        ", bankName=" + bankName +
        ", sync=" + sync +
        ", channelId=" + channelId +
        ", operator=" + operator +
        "}";
    }
}
