package com.shopping.controller;

import com.shopping.pojo.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/find")
    public ModelAndView find(){
        ModelAndView modelAndView = new ModelAndView("suer");
        User user = userService.find(2);
        modelAndView.addObject("u",user);
        return modelAndView;
    }
}
