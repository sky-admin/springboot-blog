package com.lihuanyu.blog.model;

import javax.persistence.*;

/**
 * Created by skyADMIN on 16/6/19.
 */
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany(mappedBy = "categoryid")
    private int id;

    private String categoryname;

    public Category() {
    }

    public Category(String categoryname) {
        this.categoryname = categoryname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
