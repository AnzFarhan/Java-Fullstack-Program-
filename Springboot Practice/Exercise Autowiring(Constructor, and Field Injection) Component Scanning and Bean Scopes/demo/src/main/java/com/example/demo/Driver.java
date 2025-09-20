package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Driver {

    private String name;

    public Driver(){
//        System.out.println("Driver");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
