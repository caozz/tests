package com.jk.service;

import com.jk.entity.UserInfo;
import com.jk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserInfo> queryUserInfo() {
       return  userMapper.queryUserInfo();
    }
}
