package com.xiaoluomo.controller;

import com.xiaoluomo.po.UserPo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Json {
    @RequestMapping(value = "/testJson",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
    public UserPo testJson(@RequestBody UserPo user){
        //@RequestBody  将请求体中的json格式绑定到user形参上
        System.out.println(user);
        return user;

    }
    //restful
    @RequestMapping(value = "/user_json/{id}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public UserPo testUser(@PathVariable("id") Integer id){
        UserPo user = new UserPo();
        user.setId(id);
        user.setName("hello");
        user.setPass("1234567");

        return user;

    }


}
