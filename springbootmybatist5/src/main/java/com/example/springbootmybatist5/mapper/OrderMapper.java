package com.example.springbootmybatist5.mapper;

import com.example.springbootmybatist5.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    Integer add(@Param(value = "order") Order order);
    Integer del(Integer id);
    Integer update(@Param(value = "order3") Order order);
    Order find(Integer id);
    List<Order> findAll();
}
