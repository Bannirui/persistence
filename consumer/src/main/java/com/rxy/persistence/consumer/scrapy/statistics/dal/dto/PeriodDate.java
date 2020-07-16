package com.rxy.persistence.consumer.scrapy.statistics.dal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description: 起始日期 终止日期
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeriodDate {
    private Date startTime;
    private Date endTime;
}
