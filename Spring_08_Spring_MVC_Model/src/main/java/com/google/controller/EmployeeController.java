package com.google.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {
        model.addAttribute("name", "Google");
        model.addAttribute("department", "HR");

        return "employee/welcome";
    }

    @RequestMapping("/employees")
    public String allEmployees(Model model) {
        model.addAttribute("allEmployees", List.of("Tony", "Ban", "Albert"));

        return "employee/employees";
    }
}
