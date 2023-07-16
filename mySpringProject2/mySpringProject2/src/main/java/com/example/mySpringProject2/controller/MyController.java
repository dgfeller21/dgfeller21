package com.example.mySpringProject2.controller;
y
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!";
    }
}
