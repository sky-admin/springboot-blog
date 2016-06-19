package com.lihuanyu.blog.model;

import javax.persistence.*;

/**
 * Created by skyADMIN on 16/6/19.
 */
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String content;

    private char status;
    private int view;

    @OneToMany
    private int categoryid;

    public Article() {
    }

    public Article(String title, String content) {
        this.view = 0;
        this.status = 'n';
        this.title = title;
        this.content = content;
        this.categoryid = 0;
    }

    public Article(String title, String content, int categoryid) {
        this.view = 0;
        this.title = title;
        this.content = content;
        this.status = 'n';
        this.categoryid = categoryid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }
}
