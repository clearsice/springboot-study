package com.f.springboot20.service;

import com.f.springboot20.bean.User;
import com.f.springboot20.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    public User Sel(int id) {
        return userMapper.Sel(id);
    }

    public User getNameById(int id) {
        return userMapper.getNameById(id);
    }

    public User login(String userName, String passWord) {
        return userMapper.login(userName,passWord);
    }

    public int register(User user) {
        return userMapper.register(user);
    }
}
