package com.bingo.spider.service.impl;

import com.bingo.spider.entity.PageEntity;
import com.bingo.spider.service.ParseService;
import com.bingo.spider.util.HtmlUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;



/**
 * 优酷页面解析 service impl
 *
 * @author bingo
 * @since 2018/9/1
 */

@Service
@PropertySource(value = "classpath:config/youku.properties", encoding = "UTF-8")
public class YoukuParseServiceImpl implements ParseService {

    @Value("${totalPlayNumberCssQuery}")
    private String totalPlayNumberCssQuery;

    @Value("${commentNumberCssQuery}")
    private String commentNumberCssQuery;

    @Value("${likeNumberCssQuery}")
    private String likeNumberCssQuery;

    @Value("${totalPlayNumberRegex}")
    private String totalPlayNumberRegex;

    @Value("${commentNumberRegex}")
    private String commentNumberRegex;

    @Value("${likeNumberRegex}")
    private String likeNumberRegex;

    @Override
    public void parse(PageEntity pageEntity) {
        Document document = Jsoup.parse(pageEntity.getContent());

        // 获取总播放数
        String totalPlayNumber = HtmlUtil.getField(document, totalPlayNumberCssQuery, totalPlayNumberRegex);
        System.out.println("总播放数：" + totalPlayNumber);

        // 获取评论数
        String commentNumber = HtmlUtil.getField(document, commentNumberCssQuery, commentNumberRegex);
        System.out.println("评论：" + commentNumber);

        // 获取点赞数
        String likeNumber = HtmlUtil.getField(document, likeNumberCssQuery, likeNumberRegex);
        System.out.println("点赞数：" + likeNumber);

    }
}
