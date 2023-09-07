package com.google.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user") // find HTTP path
    public String userInfo(){
        return "/user/userinfo.html";
    }
}
