package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AnotherComponentLazy {

    private final LazyComponent lazyComponent;
    public AnotherComponentLazy(LazyComponent lazyComponent){
        this.lazyComponent = lazyComponent;
        System.out.println("Another component initliazed");
    }

    public void accessLazyComponent(){
        System.out.println("Accessing the lazy component for the first time..");
    }
}
