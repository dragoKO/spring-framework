package com.google.controller;


import com.google.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("employees", DataGenerator.createStudents(100));

        return "employee/register";
    }
//(value = "make",required = false,defaultValue = "Tesla"
    @RequestMapping("/welcome")
    public String welcome(@RequestParam(value="id",required = false) String id) {
        System.out.println(id);
        return "employee/welcome";
    }
}

