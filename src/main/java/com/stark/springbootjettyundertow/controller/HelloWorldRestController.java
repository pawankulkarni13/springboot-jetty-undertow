package com.stark.springbootjettyundertow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldRestController {

    @GetMapping
    public String hello() throws Exception {
        Thread.sleep(100);
        System.out.println("Hello World");
        return "Hello World";
    }
}
