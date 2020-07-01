package com.rxy.persistence.provider.dal.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String isDelete;

    private String bankName;

    private String label;

    private Integer longMsg;

    private Integer sync;

    private String bank;

    private String createTime;

    private Integer enable;

    private String sms;

    private String alias;

    private Integer verify;

    private String channelName;

    private String labelName;

    private Integer channelId;
}
