package com.elenakuropatkina.adminui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login_form";
    }

    @GetMapping("/products")
    public String productForUser() {
        return "products";
    }


}


