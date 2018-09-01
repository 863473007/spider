package com.bingo.spider.service;

import com.bingo.spider.entity.PageEntity;

/**
 * 页面下载接口 service
 *
 * @author bingo
 * @since 2018/9/1
 */

public interface DownloadService {
    /**
     * 通过url下载页面html
     *
     * @param url 链接
     * @return 页面实体
     */
    PageEntity download(String url);
}
