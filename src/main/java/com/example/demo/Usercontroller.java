package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class Usercontroller { 
    @GetMapping
    public String demo()
    {
        return "welcome to Springboot";
    }
    
}
