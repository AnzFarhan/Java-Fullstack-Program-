package com.example.demo;

import org.springframework.stereotype.Component;

@Component("spanishGreetingService")
public class SpanishGreetingService implements GreetingServiceClass {

    public SpanishGreetingService(){
        System.out.println("This a constructor SpanishGreetingService class");
    }

    public void getSpanishGreetingService(){
        System.out.println("This a method getSpanishGreetingService");
    }

    @Override
    public String greet() {
        return "Hola";
    }
}
