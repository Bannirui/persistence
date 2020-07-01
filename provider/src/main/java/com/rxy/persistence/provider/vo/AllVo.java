package com.rxy.persistence.provider.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllVo {
    private Integer code;
    private String message;
    private PersistenceVo data;
}
