package com.google.controller;

import com.google.model.Director;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/director")
public class DirectorController {

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("director", new Director());

        return "director/director-register";
    }

    @PostMapping("/register")
    public String formFilled(@ModelAttribute("mentor") Director director, Model model) {
        System.out.println(director);
        model.addAttribute("director", new Director());

        return "director/director-confirmation";
    }

}
