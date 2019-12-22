package com.xiaoluomo.controller;

import com.xiaoluomo.po.User;
import com.xiaoluomo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userServices")
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User user(Integer id, Model model){
        return this.userService.findUserById(id);

    }


}
