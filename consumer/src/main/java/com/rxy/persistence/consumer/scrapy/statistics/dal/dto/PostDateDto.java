package com.rxy.persistence.consumer.scrapy.statistics.dal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDateDto {

    private String startDate;
    private String endDate;
}
