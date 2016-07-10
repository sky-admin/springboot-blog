package com.lihuanyu.blog.controller;

import com.lihuanyu.blog.dto.ErrorReporter;
import com.lihuanyu.blog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyADMIN on 16/7/10.
 */
@RestController
public class AuthController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ErrorReporter doLogin(String username, String password){
        return loginService.login(username, password);
    }

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public ErrorReporter doReg(String username, String password, String nickname, String email){
        return loginService.reg(username, password, email, nickname);
    }

}
