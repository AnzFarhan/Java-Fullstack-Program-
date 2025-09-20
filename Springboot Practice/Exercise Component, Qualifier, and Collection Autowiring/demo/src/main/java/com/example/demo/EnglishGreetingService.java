package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component (("englishGreetingService"))
public class EnglishGreetingService implements GreetingServiceClass {

    public EnglishGreetingService(){
        System.out.println("This a constructor EnglishGreetingService class");
    }

    public void getEnglishGreetingService(){
        System.out.println("This a method getEnglishGreetingService");
    }

    @Override
    public String greet() {
        return "Hello";
    }
}
