package com.vchehle.webSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/shop")
    public String shopPage(Model model){
        return "shopSource";
    }

}
