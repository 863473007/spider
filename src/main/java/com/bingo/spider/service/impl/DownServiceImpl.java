package com.bingo.spider.service.impl;

import com.bingo.spider.entity.PageEntity;
import com.bingo.spider.service.DownloadService;
import com.bingo.spider.util.PageDownloadUtil;
import org.springframework.stereotype.Service;

/**
 * 页面下载 service impl
 *
 * @author bingo
 * @since 2018/9/1
 */

@Service
public class DownServiceImpl implements DownloadService {

    @Override
    public PageEntity download(String url) {
        PageEntity pageEntity = new PageEntity();
        pageEntity.setContent(PageDownloadUtil.getPageContent(url));
        pageEntity.setUrl(url);
        return pageEntity;
    }
}
