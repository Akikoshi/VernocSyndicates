package com.semjasa.vernocsyndicates.controllers;

import com.semjasa.vernocsyndicates.services.NewsletterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewsletterController {
    private final NewsletterService newsletterService;

    public NewsletterController(NewsletterService newsletterService) {
        this.newsletterService = newsletterService;
    }

    @RequestMapping({"/newsletters", "/newsletters/index","/newsletters/index.html"})
    public String index(Model model){
        model.addAttribute("newsletters", newsletterService.findAll());
        return "newsletters/index";
    }
}
