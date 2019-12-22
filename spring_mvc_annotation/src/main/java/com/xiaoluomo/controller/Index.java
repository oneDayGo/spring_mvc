package com.xiaoluomo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Index {

    @RequestMapping(value = "/test")
    public String handleRequest(HttpServletRequest req, HttpServletResponse res, Model model){

        model.addAttribute("msg","spring mvc 程序");
        return "/test";
    }
}
