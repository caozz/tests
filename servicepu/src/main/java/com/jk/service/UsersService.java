package com.jk.service;

import com.jk.entity.UserInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("userb")
public interface UsersService {

    @RequestMapping(value="qwe",method = RequestMethod.GET)
    List<UserInfo> queryUserInfo();

    @RequestMapping(value="qwe",method = RequestMethod.POST)
    void addUserInfo(@RequestBody UserInfo userInfo);
}
