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
public class RpLoanLabelCheckAll implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String bankName;

    private String label;

    private Long longMsg;

    private Long sync;

    private String url;

    private String urlKey;

    private String bank;

    private String modifyTime;

    private String createTime;

    private Long enable;

    private Long individuation;

    private String name;

    private String alias;

    private Long verify;

    private String updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Long getLongMsg() {
        return longMsg;
    }

    public void setLongMsg(Long longMsg) {
        this.longMsg = longMsg;
    }

    public Long getSync() {
        return sync;
    }

    public void setSync(Long sync) {
        this.sync = sync;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
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

    public Long getIndividuation() {
        return individuation;
    }

    public void setIndividuation(Long individuation) {
        this.individuation = individuation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Long getVerify() {
        return verify;
    }

    public void setVerify(Long verify) {
        this.verify = verify;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RpLoanLabelCheckAll{" +
        "id=" + id +
        ", bankName=" + bankName +
        ", label=" + label +
        ", longMsg=" + longMsg +
        ", sync=" + sync +
        ", url=" + url +
        ", urlKey=" + urlKey +
        ", bank=" + bank +
        ", modifyTime=" + modifyTime +
        ", createTime=" + createTime +
        ", enable=" + enable +
        ", individuation=" + individuation +
        ", name=" + name +
        ", alias=" + alias +
        ", verify=" + verify +
        ", updateTime=" + updateTime +
        "}";
    }
}
