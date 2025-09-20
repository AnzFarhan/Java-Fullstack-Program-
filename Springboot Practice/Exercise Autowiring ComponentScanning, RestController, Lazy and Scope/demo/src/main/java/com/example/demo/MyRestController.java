package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MyRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, World!";
    }
}
