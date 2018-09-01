package com.bingo.spider.repository;

import com.bingo.spider.entity.PageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author bingo
 * @since 2018/9/1
 */

public interface PageRepository extends JpaRepository<PageEntity, Integer> {
    
}
