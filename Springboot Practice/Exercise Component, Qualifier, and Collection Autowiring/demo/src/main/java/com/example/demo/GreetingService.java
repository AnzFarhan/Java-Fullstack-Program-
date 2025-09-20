package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    public GreetingService(){
        System.out.println("This is a constructor GreetingService");
    }

    public String greetingService(){
        return ("This a method greetingService");
    }
}
