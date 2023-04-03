package com.example.springbootmybatist5.orderjson;

import com.example.springbootmybatist5.pojo.Order;
import lombok.Data;

import java.util.List;

@Data
public class OrderJson {
    private Integer statue;
    private String info;
    private String date;
    private Order order;
    private List<Order> orders;
}
