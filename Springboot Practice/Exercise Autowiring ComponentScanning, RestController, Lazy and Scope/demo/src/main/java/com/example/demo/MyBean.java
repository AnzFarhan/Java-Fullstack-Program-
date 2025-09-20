package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    public MyBean(){
        System.out.println("My Bean Class Contractor");
    }

    public void getMyBean(){
        System.out.println("This is my bean class");
    }
}
