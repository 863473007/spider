package com.bingo.spider.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * 页面下载工具类
 *
 * @author bingo
 * @since 2018/9/1
 */

public class PageDownloadUtil {

    public static String getPageContent(String url) {
        HttpClientBuilder builder = HttpClientBuilder.create();
        CloseableHttpClient client = builder.build();

        HttpGet request = new HttpGet(url);
        try {
            CloseableHttpResponse response = client.execute(request);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(entity);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
