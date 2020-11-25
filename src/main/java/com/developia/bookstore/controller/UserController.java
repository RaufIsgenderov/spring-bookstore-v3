package com.developia.bookstore.controller;

import com.developia.bookstore.model.User;
import com.developia.bookstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private final UserService loginService;

    @PostMapping(value = "/register")
    public String register(@ModelAttribute User user) {
        loginService.register(user);
        return "home";
    }
}
