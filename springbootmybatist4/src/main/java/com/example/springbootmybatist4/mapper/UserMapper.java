package com.example.springbootmybatist4.mapper;

import com.example.springbootmybatist4.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.relational.core.sql.In;
@Mapper
public interface UserMapper {
    Integer add(@Param(value = "user") User user);
    Integer del(@Param(value = "user2") User user);
    Integer update(@Param(value = "user3") User user);
    User findId(Integer uid);
    int del2(int uid);
}
