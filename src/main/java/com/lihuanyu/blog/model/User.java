package com.lihuanyu.blog.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by skyADMIN on 16/7/10.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String password;
    private String email;

    private String nickname;

    private LocalDate regday;
    private LocalTime regtime;

    public User() {
    }

    public User(String username, String password, String email, String nickname) {
        LocalDate regday = LocalDate.now();
        LocalTime regtime = LocalTime.now();
        this.username = username;
        this.password = password;
        this.email = email;
        this.nickname = nickname;
        this.regday = regday;
        this.regtime = regtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getRegday() {
        return regday;
    }

    public void setRegday(LocalDate regday) {
        this.regday = regday;
    }

    public LocalTime getRegtime() {
        return regtime;
    }

    public void setRegtime(LocalTime regtime) {
        this.regtime = regtime;
    }
}
