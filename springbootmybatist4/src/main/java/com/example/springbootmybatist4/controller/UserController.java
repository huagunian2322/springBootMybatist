package com.example.springbootmybatist4.controller;

import com.example.springbootmybatist4.pojo.User;
import com.example.springbootmybatist4.service.UserService;
import com.example.springbootmybatist4.userjson.UserJsonState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public UserJsonState add(@RequestBody User user){
        String info = "添加失败";
        String date = "";
        Boolean add = userService.add(user);
        if(add == true){
            info = "添加成功";
            date = "true";
        }
        UserJsonState userJsonState = new UserJsonState();
        userJsonState.setStatue(200);
        userJsonState.setDate(date);
        userJsonState.setInfo(info);
        return userJsonState;
    }
    @DeleteMapping("/del")
    public UserJsonState del(@RequestBody User user){
        String info = "删除失败";
        String date = "";
        Boolean del = userService.del(user);
        if (del == true){
            info = "删除成功";
            date = "true";
        }
        UserJsonState userJsonState = new UserJsonState();
        userJsonState.setStatue(200);
        userJsonState.setInfo(info);
        userJsonState.setDate(date);
        return userJsonState;
    }
    @PutMapping("/update")
    public UserJsonState update(@RequestBody User user){
        String info = "修改失败";
        String date = "";
        Boolean update = userService.update(user);
        if (update == true){
            info = "修改成功";
            date = "true";
        }
        UserJsonState userJsonState = new UserJsonState();
        userJsonState.setStatue(200);
        userJsonState.setInfo(info);
        userJsonState.setDate(date);
        return userJsonState;
    }
    @DeleteMapping("/{uid}")
    public  UserJsonState del(@PathVariable int uid){
        UserJsonState userJson=new UserJsonState();
        userJson.setInfo("删除数据");
        userJson.setDate("失败");
        boolean isok=  userService.del2(uid);
        if(isok==true){
            userJson.setDate("成功");
        }
        return userJson;
    }
    @GetMapping("/{uid}")
    public UserJsonState find(@PathVariable Integer uid){
        User user = userService.find(uid);
        UserJsonState userJsonState = new UserJsonState();
        userJsonState.setInfo("查询数据");
        userJsonState.setStatue(200);
        userJsonState.setDate("查询成功");
        userJsonState.setUser(user);
        return userJsonState;
    }

}
