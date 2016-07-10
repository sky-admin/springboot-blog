package com.lihuanyu.blog.dao;

import com.lihuanyu.blog.model.Article;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by skyADMIN on 16/6/19.
 */
public interface ArticleDao extends CrudRepository<Article, Integer> {
    public Iterable<Article> findAllByOrderById();
}
