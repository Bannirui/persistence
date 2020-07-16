package com.rxy.persistence.provider.vo;

import com.rxy.persistence.provider.dal.entity.StatisticsInfo;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Data
public class StatisticsResultVo {
    private Integer code;
    private String message;
    private Map<String, List<StatisticsInfo>> data;
}
