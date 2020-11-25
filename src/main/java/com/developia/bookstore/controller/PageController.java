package com.developia.bookstore.controller;

import com.developia.bookstore.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping(value = {"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping(value = {"/registerForm"})
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "userRegister";
    }

    @GetMapping(value = {"/loginForm"})
    public String login() {
        return "userLogin";
    }
}
