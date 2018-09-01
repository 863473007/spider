package com.bingo.spider.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 存储页面信息 entity
 *
 * @author bingo
 * @since 2018/9/1
 */

@Entity
@Data
@Table(name = "t_page")
public class PageEntity {

    /**
     * 自增长id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 页面内容
     */
    @Column(columnDefinition="LONGTEXT")
    private String content;

    /**
     * 总播放数
     */
    private Long totalPlayNumber;

    /**
     * 每日播放增量
     */
    private Long perDayNumber;

    /**
     * 评论数
     */
    private Long commentNumber;

    /**
     * 收藏数
     */
    private Long collectNumber;

    /**
     * 赞数
     */
    private Long likeNumber;

    /**
     * 踩数
     */
    private Long dislikeNumber;

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
    private Long childNumber;

}
