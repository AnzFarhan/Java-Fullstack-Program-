package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceAutowired {

    @Autowired
    GreetingService greetingService;

    @Autowired
    public GreetingServiceAutowired(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @Autowired
    public void getGreetingServiceAutowired(){
        System.out.println("** This method get from GreetingService class **");
        greetingService.greetingService();

    }
}
