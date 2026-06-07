package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @RequestMapping("/")
    public String index(){
        return String.format("%s","<h1>hello</h1>");
    }
}
