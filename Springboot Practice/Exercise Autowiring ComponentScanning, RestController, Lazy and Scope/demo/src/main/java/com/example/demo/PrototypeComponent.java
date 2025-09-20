package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class PrototypeComponent {

    public PrototypeComponent(){
        System.out.println("Prototype Component initliazed " + this);
    }
}
