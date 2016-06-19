package com.lihuanyu.blog.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by skyADMIN on 16/6/19.
 */
public interface ArticleDao extends CrudRepository<Article, Integer> {
}
