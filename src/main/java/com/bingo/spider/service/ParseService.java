package com.bingo.spider.service;

import com.bingo.spider.entity.PageEntity;

/**
 * 页面解析接口 service
 *
 * @author bingo
 * @since 2018/9/1
 */

public interface ParseService {
    /**
     * 解析页面
     *
     * @param pageEntity 页面实体
     */
    void parse(PageEntity pageEntity);
}
