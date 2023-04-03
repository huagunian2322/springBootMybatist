package com.example.springbootmybatist5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.springbootmybatist5.mapper")
public class Springbootmybatist5Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootmybatist5Application.class, args);
    }

}
