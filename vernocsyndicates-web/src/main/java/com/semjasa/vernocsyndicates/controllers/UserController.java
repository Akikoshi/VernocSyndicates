package com.semjasa.vernocsyndicates.controllers;

import com.semjasa.vernocsyndicates.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"/users","/users/indes","/users/index.html"})
    public String listUser(Model model){
        model.addAttribute("users",userService.findAll());
        return "users/index";
    }
}
