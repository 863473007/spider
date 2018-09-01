package com.bingo.spider.service;

import com.bingo.spider.entity.PageEntity;

/**
 * 页面下载接口 service
 *
 * @author bingo
 * @since 2018/9/1
 */

public interface DownloadService {
    PageEntity download(String url);
}
