package com.example.springbootmybatist5.controller;

import com.example.springbootmybatist5.orderjson.OrderJson;
import com.example.springbootmybatist5.pojo.Order;
import com.example.springbootmybatist5.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/add")
    public OrderJson add(@RequestBody Order order){
        Integer statue = null;
        String info = "添加失败";
        Boolean add = orderService.add(order);
        if (add == true){
           statue = 200;
           info = "添加成功";
        }
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo(info);
        orderJson.setStatue(statue);
        return orderJson;
    }
    @DeleteMapping("/{id}")
    public OrderJson del(@PathVariable int id){
        Integer statue = null;
        String info = "删除失败";
        Boolean isok = orderService.del(id);
        if (isok == true){
            statue = 200;
            info = "删除成功";
        }
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo(info);
        orderJson.setStatue(statue);
        return orderJson;
    }

    @PutMapping("/update")
    public OrderJson update(@RequestBody Order order){
        Integer statue = null;
        String info = "修改失败";
        Boolean update = orderService.update(order);
        if (update == true){
            statue = 200;
            info = "修改成功";
        }
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo(info);
        orderJson.setStatue(statue);
        return orderJson;
    }
    @GetMapping("/{uid}")
    public OrderJson select(@PathVariable Integer uid){
        Integer statue = 200;
        String info = "查询成功";
        Order order = orderService.findId(uid);
        OrderJson orderJson = new OrderJson();
        orderJson.setInfo(info);
        orderJson.setStatue(statue);
        orderJson.setOrder(order);
        return orderJson;
    }
    @GetMapping("/findAll")
    public OrderJson selectAll(){
        Integer statue = 200;
        String info = "查询成功";
        List<Order> orders = orderService.findAll();

        OrderJson orderJson = new OrderJson();
        orderJson.setInfo(info);
        orderJson.setStatue(statue);
        orderJson.setOrders(orders);
        return orderJson;
    }
}
