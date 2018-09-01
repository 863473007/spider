package com.bingo.spider.service.impl;

import com.bingo.spider.entity.PageEntity;
import com.bingo.spider.service.ParseService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 优酷页面解析 service impl
 *
 * @author bingo
 * @since 2018/9/1
 */

@Service
public class YoukuParseServiceImpl implements ParseService {

    private String totalPlayNumberRegex = "(?<=总播放数：)[\\d,]+";


    @Override
    public void parse(PageEntity pageEntity) {
        Document document = Jsoup.parse(pageEntity.getContent());

        // 获取总播放数
        Elements elements = document.select("body > div.s-body > div > div.mod.mod-new > div.mod.fix > div.p-base > ul > li:nth-child(11)");
        if (elements == null || elements.size() == 0) {
            return;
        }
        Element total = elements.get(0);
        Pattern pattern = Pattern.compile(totalPlayNumberRegex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(total.text());
        if (matcher.find()) {
            System.out.println("总播放数：" + matcher.group(0));
        }

        // 获取评论数
        // body > div.s-body > div > div.mod.mod-new > div.mod.fix > div.p-base > ul > li:nth-child(12)


    }
}
