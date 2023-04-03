package com.shopping.dao;

import com.shopping.pojo.User;

public interface UserDao {
    User findById(Integer id);
}
