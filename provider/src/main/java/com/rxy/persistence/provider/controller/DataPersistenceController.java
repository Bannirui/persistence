package com.rxy.persistence.provider.controller;

import com.rxy.persistence.provider.dal.RequestDateDto;
import com.rxy.persistence.provider.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.provider.dal.entity.StatisticsInfo;
import com.rxy.persistence.provider.service.RpLoanLabelBatchCheckService;
import com.rxy.persistence.provider.service.StatisticsInfoService;
import com.rxy.persistence.provider.vo.AllVo;
import com.rxy.persistence.provider.vo.PersistenceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@RestController
@RequestMapping("/persistence")
public class DataPersistenceController {

    @Autowired
    private RpLoanLabelBatchCheckService rpLoanLabelBatchCheckService;

    @Autowired
    private StatisticsInfoService statisticsInfoService;

    @GetMapping("/all")
    public AllVo all() {
        AllVo allVo = new AllVo();
        PersistenceVo persistenceVo = new PersistenceVo();
        List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList = this.rpLoanLabelBatchCheckService.list();
        List<StatisticsInfo> statisticsInfoList = this.statisticsInfoService.list();
        persistenceVo.setRpLoanLabelBatchCheckList(rpLoanLabelBatchCheckList);
        persistenceVo.setStatisticsInfoList(statisticsInfoList);

        allVo.setCode(200);
        allVo.setMessage("ok");
        allVo.setData(persistenceVo);
        return allVo;
    }

    @PostMapping("/allWithPost")
    public AllVo allWithPost(@RequestBody RequestDateDto requestDateDto) {
        System.out.println("模拟入参校验>>>" + requestDateDto);
        AllVo allVo = new AllVo();
        PersistenceVo persistenceVo = new PersistenceVo();
        List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList = this.rpLoanLabelBatchCheckService.list();
        List<StatisticsInfo> statisticsInfoList = this.statisticsInfoService.list();
        persistenceVo.setRpLoanLabelBatchCheckList(rpLoanLabelBatchCheckList);
        persistenceVo.setStatisticsInfoList(statisticsInfoList);

        allVo.setCode(200);
        allVo.setMessage("ok");
        allVo.setData(persistenceVo);
        return allVo;
    }
}
