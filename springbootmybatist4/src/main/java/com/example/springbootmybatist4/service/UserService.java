package com.example.springbootmybatist4.service;

import com.example.springbootmybatist4.pojo.User;
import org.springframework.data.relational.core.sql.In;

public interface UserService {
    Boolean add(User user);
    Boolean del(User user);
    Boolean update(User user);
    User find(Integer id);
    Boolean del2(Integer id);
}
