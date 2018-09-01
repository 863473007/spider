package com.bingo.spider.service;

import com.bingo.spider.entity.PageEntity;
import com.bingo.spider.service.impl.YoukuParseServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 优酷页面解析 service test
 *
 * @author bingo
 * @since 2018/9/1
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class YoukuParseServiceTest {

    @Autowired
    DownloadService downloadService;

    @Autowired
    YoukuParseServiceImpl youkuParseService;

    @Test
    public void testParse() {
        String url = "http://list.youku.com/show/id_z9cd2277647d311e5b692.html?spm=a2htv.20005143.m13050845531.5~5~1~3~A&from=y1.3-tv-index-2640-5143.40177.1-1";
        PageEntity entity = downloadService.download(url);
        youkuParseService.parse(entity);
    }
}
