package com.rxy.persistence.provider.dal.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@Data
public class PostDateDto {
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String endTime;
}
