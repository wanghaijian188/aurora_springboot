package com.example.whj.dao;

import com.example.whj.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selUserInfo();
}
