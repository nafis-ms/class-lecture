package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Web{
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}