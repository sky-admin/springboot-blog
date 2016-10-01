package com.lihuanyu.blog.controller;

import com.lihuanyu.blog.dao.ArticleDao;
import com.lihuanyu.blog.model.Article;
import com.lihuanyu.blog.model.User;
import com.lihuanyu.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by skyADMIN on 16/6/19.
 */
@RestController
public class ArticleController {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private LoginService loginService;

    @RequestMapping("/articles")
    public Object showArticles(@RequestParam(value = "page", defaultValue = "0") Integer page,
                               @RequestParam(value = "size", defaultValue = "15") Integer size) {
        Pageable pageable = new PageRequest(page, size);
        return articleDao.findAllByOrderByIdDesc(pageable);
    }

    @RequestMapping("/postnew")
    public String newArticle(String title, String content) {
        if (loginService.isLogin() == 0) {
            return "no-login";
        }
        User currentUser = (User) httpSession.getAttribute("user");
        try {
            Article article = new Article(title, content, currentUser);
            articleDao.save(article);
            return "success";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("/article")
    public Article showArticle(int id) {
        return articleDao.findOne(id);
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public Object editArticle(int id, String title, String content) {
        if (loginService.isLogin() == 0) {
            return "no-login";
        }
        User currentUser = (User) httpSession.getAttribute("user");
        Article article = articleDao.findOne(id);
        if (currentUser.getId() != article.getAuthor().getId()){
            return "no-access";
        }
        article.setTitle(title);
        article.setContent(content);
        articleDao.save(article);
        return "success";
    }
}
