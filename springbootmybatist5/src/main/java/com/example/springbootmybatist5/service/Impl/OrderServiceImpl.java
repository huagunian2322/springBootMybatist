package com.example.springbootmybatist5.service.Impl;

import com.example.springbootmybatist5.mapper.OrderMapper;
import com.example.springbootmybatist5.pojo.Order;
import com.example.springbootmybatist5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Boolean add(Order order) {
        Integer row = orderMapper.add(order);
        return row > 0;
    }

    @Override
    public Boolean del(Integer id) {
        Integer row = orderMapper.del(id);
        return row > 0;
    }

    @Override
    public Boolean update(Order order) {
        Integer row = orderMapper.update(order);
        return row > 0;
    }

    @Override
    public Order findId(Integer id) {
        return orderMapper.find(id);
    }

    @Override
    public List<Order> findAll() {
        return orderMapper.findAll();
    }
}
