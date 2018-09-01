package com.bingo.spider.util;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.Pattern;

/**
 * 页面字段信息获取 工具类
 *
 * @author bingo
 * @since 2018/9/1
 */

public class HtmlUtil {

    public static String getField(Document document, String cssQuery, String regex) {
        Elements elements = document.select(cssQuery);
        if (elements == null || elements.size() == 0) {
            return "0";
        }
        Element element = elements.get(0);
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        return RegexUtil.getPageInfo(element.text(), pattern, 0);

    }
}
