package com.cf.cloud.order.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class OrderController {

    @GetMapping("index")
    public String index(){
        return "order index";
    }

//    @GetMapping("logout")
//    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
//    {
//        HttpSession session = request.getSession(false);
//            if (session != null) {
//                session.invalidate(); //使当前会话失效
//            }
//
//        SecurityContextHolder.clearContext(); //清空安全上下文
//    }
}
