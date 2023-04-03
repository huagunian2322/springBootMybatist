package com.example.springbootmybatist5.pojo;

import lombok.Data;

@Data
public class Order {
    private Integer orderId;
    private String orderName;
    private Double orderPrice;
    private Integer orderUserId;
}
