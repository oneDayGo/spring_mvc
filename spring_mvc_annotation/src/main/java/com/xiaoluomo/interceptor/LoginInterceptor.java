package com.xiaoluomo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //获取请求url
        String url = request.getRequestURI();

        //拦截此请求
        if(url.indexOf("/toLogin") >= 0){
            return  true;
        }
        if(url.indexOf("/login")>= 0){
            return  true;
        }

        HttpSession session = request.getSession();
        if(session.getAttribute("user") != null){
            return  true;
        }

        request.setAttribute("msg","请登陆");
        //转发请求
        request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request,response);
        return false;

    }
}
