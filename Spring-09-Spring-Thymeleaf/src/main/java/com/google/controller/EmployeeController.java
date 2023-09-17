package com.google.controller;


import com.google.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("employees", DataGenerator.createStudents(100));

        return "employee/register";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "employee/welcome";
    }
}

