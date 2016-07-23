package com.lihuanyu.blog.dao;

import com.lihuanyu.blog.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by skyADMIN on 16/6/19.
 */
public interface ArticleDao extends CrudRepository<Article, Integer>,PagingAndSortingRepository<Article, Integer> {
    public Iterable<Article> findAllByOrderByIdDesc();
    public Page<Article> findAllByOrderByIdDesc(Pageable pageable);
}
