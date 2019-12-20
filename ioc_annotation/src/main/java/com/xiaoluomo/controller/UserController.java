package com.xiaoluomo.controller;

import org.springframework.stereotype.Controller;
import com.xiaoluomo.service.UserService;

import javax.annotation.Resource;

@Controller("userController")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    public void save(){
        this.userService.save();
        System.out.println("运行userController.save()");
    }

}
