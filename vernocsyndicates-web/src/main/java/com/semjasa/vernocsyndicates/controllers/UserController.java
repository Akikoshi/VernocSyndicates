package com.semjasa.vernocsyndicates.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping({"/users","/users/indes","/users/index.html"})
    public String listUser(){
        return "users/index";
    }
}
