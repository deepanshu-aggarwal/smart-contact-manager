package com.app.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("home page handler!!");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("isLogin", true);
        return "about";
    }

    @RequestMapping("/services")
    public String services() {
        return "services";
    }

}
