package com.rxy.persistence.consumer.scrapy.api.crawl.pipeline.save;

import us.codecraft.webmagic.ResultItems;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
public interface SaveService {
    /**
     * 接口解析结果保存到数据库
     * 先从resultItems中get到对应key的数据列表
     * 删除日期列表对应的记录
     * 保存get到的数据
     *
     * @param resultItems
     */
    void save(ResultItems resultItems, String startTime, String endTime);
}
