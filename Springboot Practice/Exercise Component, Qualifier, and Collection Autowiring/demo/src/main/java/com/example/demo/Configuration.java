package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration
public class Configuration {

    //Inside the configuration class, define a method that
    // returns an instance of a service class
    //annotate this method with @Bean.
    @Bean
    public GreetingServiceClass greetingServiceClass() {
        return () -> "Hello from @Configuration!";
    }

    //Define two GreetingService implementations
    // (e.g., EnglishGreetingService and SpanishGreetingService)
    //in the @Configuration class using @Bean.
    @Bean
    public GreetingServiceClass english(){
        return () -> "Hello from English Bean!";
    }
    //Define two GreetingService implementations
    // (e.g., EnglishGreetingService and SpanishGreetingService)
    //in the @Configuration class using @Bean.
    @Bean
    public GreetingServiceClass spanish(){
        return () -> "Hello from Spanish Bean!";
    }
}
