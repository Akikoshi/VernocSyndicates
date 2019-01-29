package com.semjasa.vernocsyndicates.controllers;

import com.semjasa.vernocsyndicates.services.NewsletterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsletterController {
    private NewsletterService newsletterService;

    public NewsletterController(NewsletterService newsletterService) {
        this.newsletterService = newsletterService;
    }

    @RequestMapping({"/newsletter/", "/newsletter/index","/newsletter/index.html"})
    public String index(){
        return "newsletters";
    }
}
