package com.semjasa.vernocsyndicates.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    @RequestMapping({"/posts","/posts/index","/posts/index.html"})
    public String listPosts(){
        return "posts/index";
    }
}
