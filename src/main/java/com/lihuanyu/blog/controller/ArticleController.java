package com.lihuanyu.blog.controller;

import com.lihuanyu.blog.model.Article;
import com.lihuanyu.blog.dao.ArticleDao;
import com.lihuanyu.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by skyADMIN on 16/6/19.
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/articles")
    public ArrayList<Article> showArticles(){
        return (ArrayList<Article>) articleDao.findAllByOrderByIdDesc();
    }

    @RequestMapping("/postnew")
    public String newArticle(String title, String content){
        if (loginService.isLogin() == 0){
            return "no-login";
        }
        try {
            Article article = new Article(title, content);
            articleDao.save(article);
            return "success";
        }catch (Exception ex){
            ex.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("/article")
    public Article showArticle(int id){
        return articleDao.findOne(id);
    }
}
