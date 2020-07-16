package com.rxy.persistence.provider.controller;

import com.rxy.persistence.provider.dal.dto.PostDateDto;
import com.rxy.persistence.provider.dal.entity.*;
import com.rxy.persistence.provider.service.*;
import com.rxy.persistence.provider.vo.ApiResultVo;
import com.rxy.persistence.provider.vo.ApiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description:
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private RpLoanLabelBatchCheckService loanLabelBatchCheckService;

    @Autowired
    private RpLoanLabelCheckAllService rpLoanLabelCheckAllService;

    @Autowired
    private RpLoanLabelCheckService rpLoanLabelCheckService;

    @Autowired
    private RpLoanSmsTemplateCheckService rpLoanSmsTemplateCheckService;

    @Autowired
    private RpLoanStatisticsDayService rpLoanStatisticsDayService;

    @PostMapping("/all")
    public ApiResultVo all(@RequestBody PostDateDto postDateDto) {
        System.out.println(">>>模拟入参验证");
        // 查询出所有数据
        List<RpLoanLabelBatchCheck> rpLoanLabelBatchChecks = this.loanLabelBatchCheckService.list();
        List<RpLoanLabelCheckAll> rpLoanLabelCheckAlls = this.rpLoanLabelCheckAllService.list();
        List<RpLoanLabelCheck> rpLoanLabelChecks = this.rpLoanLabelCheckService.list();
        List<RpLoanSmsTemplateCheck> rpLoanSmsTemplateChecks = this.rpLoanSmsTemplateCheckService.list();
        List<RpLoanStatisticsDay> rpLoanStatisticsDays = this.rpLoanStatisticsDayService.list();

        // 返回数据实体
        ApiVo apiVo = new ApiVo();
        apiVo.setRpLoanLabelBatchCheckList(rpLoanLabelBatchChecks);
        apiVo.setRpLoanLabelCheckAllList(rpLoanLabelCheckAlls);
        apiVo.setRpLoanLabelCheckList(rpLoanLabelChecks);
        apiVo.setRpLoanSmsTemplateCheckList(rpLoanSmsTemplateChecks);
        apiVo.setRpLoanStatisticsDayList(rpLoanStatisticsDays);

        // 返回响应
        ApiResultVo apiResultVo = new ApiResultVo();
        apiResultVo.setCode(200);
        apiResultVo.setMessage("ok");
        apiResultVo.setData(apiVo);

        return apiResultVo;
    }
}
