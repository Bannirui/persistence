package com.rxy.persistence.consumer.task.crawl.demo;

import com.rxy.persistence.consumer.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.dal.entity.StatisticsInfo;
import com.rxy.persistence.consumer.service.RpLoanLabelBatchCheckService;
import com.rxy.persistence.consumer.service.StatisticsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.security.PrivateKey;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * @Author: dingrui
 * @Date: Create in 2020/6/30
 * @Description:
 */
@Component
public class ApiPipeline implements Pipeline {

    @Autowired
    private RpLoanLabelBatchCheckService rpLoanLabelBatchCheckService;

    @Autowired
    private StatisticsInfoService statisticsInfoService;

    @Override
    public void process(ResultItems resultItems, Task task) {

        // pipeline从page中get到在processor中put进去的item
        List<RpLoanLabelBatchCheck> rpLoanLabelBatchCheckList = resultItems.get("rpLoanLabelBatchCheckList");
        List<StatisticsInfo> statisticsInfoList = resultItems.get("statisticsInfoList");

        // 获取到的数据判空或者其他处理后可以存储数据库了

        // 假设数据不需要判断处理 直接存储数据库 数据库设置了主键id 因此插入的时候将id属性置空
        rpLoanLabelBatchCheckList.forEach(rpLoanLabelBatchCheck -> {
            System.out.println(rpLoanLabelBatchCheck);
            int effectedRows = this.rpLoanLabelBatchCheckService.saveWithoutId(rpLoanLabelBatchCheck);
            System.out.println("rpLoanLabelBatchCheck存储>>>" + effectedRows);
        });

        // statisticsInfoList.forEach(statisticsInfo -> {
        //     boolean save = this.statisticsInfoService.save(statisticsInfo);
        //     System.out.println("statisticsInfo存储>>>" + save);
        // });
    }
}
