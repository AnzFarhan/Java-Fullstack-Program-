package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EnglishSpanishQualifierE5 {

    GreetingServiceClass englishGreetingService;
    GreetingServiceClass spanishGreetingService;

    @Autowired
    public EnglishSpanishQualifierE5(@Qualifier("englishGreetingService") GreetingServiceClass englishGreetingService,
                                           @Qualifier("spanishGreetingService") GreetingServiceClass spanishGreetingService){
        this.englishGreetingService = englishGreetingService;
        this.spanishGreetingService = spanishGreetingService;
    }

    public String setEnglishGreetingService(){
        return englishGreetingService.greet();
    }

    public String setSpanishGreetingService(){
        return spanishGreetingService.greet();
    }

    public void getGreetEnglish(){
        englishGreetingService.greet();
    }

    public void getGreetSpanish(){
        spanishGreetingService.greet();
    }
}
