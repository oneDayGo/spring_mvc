package com.xiaoluomo.controller;

import com.xiaoluomo.po.UserPo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class Login {


    @RequestMapping(value = "/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(UserPo userPo, Model model, HttpSession httpSession){

        String name = userPo.getName();
        String pass = userPo.getPass();
        if(name != null && name.equals("xiaozhe")){
            if(pass != null && pass.equals("123456")){
                httpSession.setAttribute("user",userPo);
                //登陆成功,重定向
                return "redirect:main";
            }
        }

        model.addAttribute("msg","用户名或密码错误,请重新输入");
        return "login";
    }

    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public String main(){
        return "main";
    }


    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        //清空session
        session.invalidate();
        return "redirect:toLogin";

    }
}
