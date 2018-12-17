package com.jk.controller;

import com.jk.entity.UserInfo;
import com.jk.service.UserService;
import com.jk.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UsersService {

    @Autowired
    private UserService userService;


    @Override
    public List<UserInfo> queryUserInfo(){
        return userService.queryUserInfo();
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {
        String name = userInfo.getUsername();
        System.out.println(name);
    }
}
