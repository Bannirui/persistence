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
public class RpLoanLabelCheckAll implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String bankName;

    private String label;

    private String longMsg;

    private String sync;

    private String url;

    private String urlKey;

    private String bank;

    private String modifyTime;

    private String createTime;

    private String enable;

    private String individuation;

    private String name;

    private String alias;

    private String verify;

    private String updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getIndividuation() {
        return individuation;
    }

    public void setIndividuation(String individuation) {
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

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
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
