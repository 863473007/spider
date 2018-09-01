package com.bingo.spider.entity;

/**
 * 存储页面信息 entity
 *
 * @author bingo
 * @since 2018/9/1
 */

public class PageEntity {
    /**
     * 页面内容
     */
    private String content;

    /**
     * 总播放数
     */
    private String totalPlayNumber;

    /**
     * 每日播放增量
     */
    private String perDayNumber;

    /**
     * 评论数
     */
    private String commentNumber;

    /**
     * 收藏数
     */
    private String collectNumber;

    /**
     * 赞数
     */
    private String likeNumber;

    /**
     * 踩数
     */
    private String dislikeNumber;

    /**
     * 电视剧名称
     */
    private String tvName;

    /**
     * 页面url
     */
    private String url;

    /**
     * 子集数据
     */
    private String childNumber;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTotalPlayNumber() {
        return totalPlayNumber;
    }

    public void setTotalPlayNumber(String totalPlayNumber) {
        this.totalPlayNumber = totalPlayNumber;
    }

    public String getPerDayNumber() {
        return perDayNumber;
    }

    public void setPerDayNumber(String perDayNumber) {
        this.perDayNumber = perDayNumber;
    }

    public String getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(String commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(String collectNumber) {
        this.collectNumber = collectNumber;
    }

    public String getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(String likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getDislikeNumber() {
        return dislikeNumber;
    }

    public void setDislikeNumber(String dislikeNumber) {
        this.dislikeNumber = dislikeNumber;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(String childNumber) {
        this.childNumber = childNumber;
    }
}
