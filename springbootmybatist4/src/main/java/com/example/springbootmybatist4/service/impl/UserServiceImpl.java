package com.example.springbootmybatist4.service.impl;

import com.example.springbootmybatist4.mapper.UserMapper;
import com.example.springbootmybatist4.pojo.User;
import com.example.springbootmybatist4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Boolean add(User user) {
        int row = userMapper.add(user);
        return row > 0;
    }

    @Override
    public Boolean del(User user) {
        int row = userMapper.del(user);
        return row > 0;
    }

    @Override
    public Boolean update(User user) {
        int row = userMapper.update(user);
        return row > 0;
    }

    @Override
    public User find(Integer id) {
        return userMapper.findId(id);
    }

    @Override
    public Boolean del2(Integer id) {
        int row = userMapper.del2(id);
        return row > 0;
    }

}
