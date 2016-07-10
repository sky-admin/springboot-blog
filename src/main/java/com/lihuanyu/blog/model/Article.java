package com.lihuanyu.blog.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

    private LocalDate publishday;
    private LocalDateTime lastchange;
    private String author;

    private char status;

    public Article() {
    }

    public Article(String title, String content, String author) {
        this.status = 'n';
        this.title = title;
        this.content = content;
        this.author = author;
        this.publishday = LocalDate.now();
        this.lastchange = LocalDateTime.now();
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

    public LocalDate getPublishday() {
        return publishday;
    }

    public void setPublishday(LocalDate publishday) {
        this.publishday = publishday;
    }

    public LocalDateTime getLastchange() {
        return lastchange;
    }

    public void setLastchange(LocalDateTime lastchange) {
        this.lastchange = lastchange;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
