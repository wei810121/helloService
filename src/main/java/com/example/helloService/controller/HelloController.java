package com.example.helloService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping()
    public String hello(String name){
        return "Hello World 2!" + name;
    }
}
