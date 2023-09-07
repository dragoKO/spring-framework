package com.google.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home") // find HTTP path
    public String home(){
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome.html";
    }

//  @RequestMapping("/")
    @RequestMapping()
    public String basePage(){
        return "basePage.html";
    }


}

