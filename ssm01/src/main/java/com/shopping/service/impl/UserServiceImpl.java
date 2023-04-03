package com.shopping.service.impl;

import com.shopping.dao.UserDao;
import com.shopping.pojo.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;
    @Override
    public User find(Integer id) {
        return userDao.findById(id);
    }
}
