package com.example.springbootmybatist4.userjson;

import com.example.springbootmybatist4.pojo.User;
import lombok.Data;

@Data
public class UserJsonState {
    private Integer statue;
    private String info;
    private String date;
    private User user;
}
