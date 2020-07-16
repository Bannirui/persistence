package com.rxy.persistence.consumer.scrapy.api.crawl.crawler.parse;

import com.alibaba.fastjson.JSONArray;
import us.codecraft.webmagic.Page;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/2
 * @Description:
 */
public abstract class AbstractParseArray<T> {

    /**
     * 延迟到子类自己实现
     * 解析json数组为java对象 通过page put传递给pipeline进行持久化
     *
     * @return
     */
    abstract public void parseArray(Page page, JSONArray jsonArray);
}
