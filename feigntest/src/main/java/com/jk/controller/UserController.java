package com.jk.controller;

import com.jk.entity.UserInfo;
import com.jk.service.ServiceFerign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("usera")
public class UserController {

    @Autowired
    private ServiceFerign userService;

    @RequestMapping("queryUserInfo")
    @ResponseBody
    public List<UserInfo> queryUserInfo() {
        return  userService.queryUserInfo();
    }

    @RequestMapping("addUserInfo")
    public void addUserInfo(){
        UserInfo a = new UserInfo();
        a.setUsername("毛震王八蛋");
        userService.addUserInfo(a);
    }
}