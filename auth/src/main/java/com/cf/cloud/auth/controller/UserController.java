package com.cf.cloud.auth.controller;

import org.springframework.http.MediaType;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.security.Principal;

@RestController
public class UserController {

    @GetMapping(value = "user",produces = MediaType.APPLICATION_JSON_VALUE)
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }

    @GetMapping("logout")
    public void exit(HttpServletRequest request, HttpServletResponse response){
        new SecurityContextLogoutHandler().logout(request, null, null);
        try {
            response.sendRedirect(request.getHeader("referer"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("index")
    public String index(){
        return "auth server";
    }
}
