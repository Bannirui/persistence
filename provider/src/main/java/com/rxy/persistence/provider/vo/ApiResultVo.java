package com.rxy.persistence.provider.vo;

import lombok.Data;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Data
public class ApiResultVo {
    private Integer code;
    private String message;
    private ApiVo data;
}
