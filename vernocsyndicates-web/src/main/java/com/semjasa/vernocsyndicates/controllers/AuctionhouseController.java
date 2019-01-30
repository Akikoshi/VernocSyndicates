package com.semjasa.vernocsyndicates.controllers;

import com.semjasa.vernocsyndicates.services.AuctionhouseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuctionhouseController {
    private final AuctionhouseService auctionhouseService;

    public AuctionhouseController(AuctionhouseService auctionhouseService) {
        this.auctionhouseService = auctionhouseService;
    }

    @RequestMapping({"/auctionhouse", "/auctionhouse/index", "/auctionhouse/index.html"})
    public String listAuctionhouseEntries(Model model){
        model.addAttribute("auctionhouseEntries", auctionhouseService.findAll());
        return "auctionhouse/index";
    }
}
