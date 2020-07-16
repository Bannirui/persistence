package com.rxy.persistence.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rxy.persistence.provider.dal.dto.PostDateDto;
import com.rxy.persistence.provider.dal.entity.StatisticsInfo;
import com.rxy.persistence.provider.service.StatisticsInfoService;
import com.rxy.persistence.provider.vo.StatisticsResultVo;
import com.rxy.persistence.provider.vo.StatisticsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    private StatisticsInfoService statisticsInfoService;

    @PostMapping("/all")
    public StatisticsResultVo all(@RequestBody PostDateDto postDateDto) {
        System.out.println(">>>模拟入参验证");

        // 2020-07-01
        List<StatisticsInfo> statisticsInfoList1 = statisticsInfoService.list(new LambdaQueryWrapper<StatisticsInfo>().eq(StatisticsInfo::getSendDate,"2020-07-01"));

        // 2020-06-29
       List<StatisticsInfo> statisticsInfoList2 = statisticsInfoService.list(new LambdaQueryWrapper<StatisticsInfo>().eq(StatisticsInfo::getSendDate,"2020-06-29"));

        // 2020-06-27
        List<StatisticsInfo> statisticsInfoList3 = statisticsInfoService.list(new LambdaQueryWrapper<StatisticsInfo>().eq(StatisticsInfo::getSendDate,"2020-06-27"));

        List<Map<String, List<StatisticsInfo>>> list = new ArrayList<>();

        Map<String, List<StatisticsInfo>> map = new HashMap<>();
        map.put("2020-07-01", statisticsInfoList1);
        map.put("2020-06-29", statisticsInfoList2);
        map.put("2020-06-27", statisticsInfoList3);

        // 返回数据实体
        StatisticsResultVo statisticsResultVo = new StatisticsResultVo();
        statisticsResultVo.setCode(200);
        statisticsResultVo.setMessage("ok");
        statisticsResultVo.setData(map);

        // 返回响应
        return statisticsResultVo;
    }
}
