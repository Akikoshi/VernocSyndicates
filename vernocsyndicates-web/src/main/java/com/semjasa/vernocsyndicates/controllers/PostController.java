package com.semjasa.vernocsyndicates.controllers;

import com.semjasa.vernocsyndicates.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping({"/posts","/posts/index","/posts/index.html"})
    public String listPosts(Model model){
        model.addAttribute("posts", postService.findAll());
        return "posts/index";
    }
}
