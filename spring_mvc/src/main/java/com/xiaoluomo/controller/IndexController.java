package com.xiaoluomo.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;




public class IndexController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {

        ModelAndView m = new ModelAndView();
        m.addObject("msg","第一个程序");
      //  m.setViewName("test");
        m.setViewName("/WEB-INF/jsp/test.jsp");
        return m;
    }
}
