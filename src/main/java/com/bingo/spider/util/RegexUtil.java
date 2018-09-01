package com.bingo.spider.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则匹配工具类
 *
 * @author bingo
 * @since 2018/9/1
 */

class RegexUtil {

    static String getPageInfo(String content, Pattern pattern, int groupNo) {
        Matcher matcher = pattern.matcher(content);
        return matcher.find() ? matcher.group(groupNo).trim() : "0";
    }

}
