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
public class RpLoanLabelCheck implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

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
}
