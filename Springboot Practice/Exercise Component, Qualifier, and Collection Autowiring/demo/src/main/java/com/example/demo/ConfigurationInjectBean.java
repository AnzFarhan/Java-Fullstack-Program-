package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//In another @Component class, inject the GreetingService using @Autowired.
@Component
public class ConfigurationInjectBean {

    @Autowired
    private final GreetingServiceClass greetingServiceClass;

    @Autowired
    public ConfigurationInjectBean(GreetingServiceClass greetingServiceClass) {
        this.greetingServiceClass = greetingServiceClass;
    }

    public void printGreeting() {
        System.out.println(greetingServiceClass.greet());
    }
}
