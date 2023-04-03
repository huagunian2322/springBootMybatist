package com.example.springbootmybatist4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.springbootmybatist4.mapper")
public class Springbootmybatist4Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootmybatist4Application.class, args);
    }

}
