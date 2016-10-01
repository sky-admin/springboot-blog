package com.lihuanyu.blog;

import com.lihuanyu.blog.dao.ArticleDao;
import com.lihuanyu.blog.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by skyADMIN on 16/7/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BlogApplication.class)
@WebAppConfiguration
public class DataBaseTest {

    @Autowired
    private ArticleDao articleDao;

    @Test
    @Transactional
    public void addMsgToDb(){
        for (int i = 0; i < 10; i++){
            Article article = new Article();
//            article.setAuthor("skyadmin");
            article.setContent(i+"这是一段测试文字");
            article.setTitle(i+"标题");
            article.setPublishday(LocalDate.now());
            article.setLastchange(LocalDateTime.now());
            article.setStatus('y');
            articleDao.save(article);
        }
    }

}
