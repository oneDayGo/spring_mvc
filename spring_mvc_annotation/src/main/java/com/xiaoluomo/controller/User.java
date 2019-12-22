package com.xiaoluomo.controller;

import com.xiaoluomo.po.UserPo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class User {

    @RequestMapping("/user")
    public String selectUser(HttpServletRequest req){
        String id = req.getParameter("id");
        System.out.println(id);
        return "/success";
    }

    //第二种方式
    @RequestMapping("/user2")
    public String selectUser2(@RequestParam(value = "id") Integer id){
        System.out.println(id);
        return "/success";
    }

    //注册页
    @RequestMapping("/register")
    public String register(){
        return "/register";
    }

    //接收注册信息
    @RequestMapping("/registerUser")
    public String registerUser(UserPo userPo){
        //pojo数据绑定
        System.out.println(userPo.getName());
        System.out.println(userPo.getPass());
        return  "/success";
    }
}
