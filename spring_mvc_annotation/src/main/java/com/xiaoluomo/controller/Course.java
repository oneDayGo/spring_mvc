package com.xiaoluomo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Course {

    @RequestMapping("/toCourse")
    public String toCourse(){

        return "/course";
    }

    @RequestMapping("deleteCourse")
    public String deleteCourse(Integer[] ids){
        for(Integer id:ids){
            System.out.println(id);
        }
        return "/success";
    }
}
