package com.example.whj.service.impl;

import com.example.whj.dao.UserMapper;
import com.example.whj.entity.User;
import com.example.whj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selUserInfo() {
        return userMapper.selUserInfo();
    }
}
