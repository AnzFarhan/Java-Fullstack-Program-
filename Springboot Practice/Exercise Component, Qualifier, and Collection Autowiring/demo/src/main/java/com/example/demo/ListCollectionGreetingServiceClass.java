package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ListCollectionGreetingServiceClass {

    private final List<GreetingServiceClass> greetingServicesClass;

    @Autowired
    public ListCollectionGreetingServiceClass(List<GreetingServiceClass> greetingServicesClass) {
        this.greetingServicesClass = greetingServicesClass;
    }

    public void printAllGreetings() {
        greetingServicesClass.forEach(service -> System.out.println(service.greet()));
    }
}
