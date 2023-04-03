package com.example.springbootmybatist5.service;

import com.example.springbootmybatist5.pojo.Order;

import java.util.List;

public interface OrderService {
    Boolean add(Order order);
    Boolean del(Integer id);
    Boolean update(Order order);
    Order findId(Integer id);
    List<Order> findAll();
}
