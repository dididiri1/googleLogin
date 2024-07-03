package com.example.googlelogin.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login2")
    public String loginForm() {


        return "index";
    }
}
