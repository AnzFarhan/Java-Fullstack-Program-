package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class GreetingControllerTest implements CommandLineRunner {
    @Autowired
    private GreetingEnglishSpanishQualifier greetingController;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("English Greeting: " + greetingController.setEnglishGreetingService());
        System.out.println("Spanish Greeting: " + greetingController.setSpanishGreetingService());
    }
}
