package com.rxy.persistence.consumer.scrapy.api.crawl.crawler.parse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.rxy.persistence.consumer.scrapy.api.dal.entity.RpLoanLabelBatchCheck;
import com.rxy.persistence.consumer.scrapy.api.dal.enumerate.TableNameEnum;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
@Component
public class LabelBatchCheckParse extends AbstractParseArray<RpLoanLabelBatchCheck> {

    @Override
    public void parseArray(Page page, JSONArray jsonArray) {
        // 首先判空
        if (jsonArray != null) {
            // 容器存储解析之后数据结果
            List<RpLoanLabelBatchCheck> dataList = new ArrayList<RpLoanLabelBatchCheck>();

            // 遍历array数组 json转java
            jsonArray.forEach(json -> {
                RpLoanLabelBatchCheck data = JSON.parseObject(json.toString(), RpLoanLabelBatchCheck.class);
                dataList.add(data);
            });

            // put到page pipeline中get之后持久化 以tableName字符串做为key
            page.putField(TableNameEnum.BATCHCHECK.getName(), dataList);
        }
    }
}
