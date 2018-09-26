package com.cf.cloud.auth.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.security.Principal;

@RestController
public class UserController {

    @GetMapping(value = "user",produces = MediaType.APPLICATION_JSON_VALUE)
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }

    @GetMapping("index")
    public String index(){
        return "auth server";
    }
}
