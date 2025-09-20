package com.example.ExerciseBeanConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectClassLazyComponent {

    private final LazyComponent lazyComponent;

    public InjectClassLazyComponent(LazyComponent lazyComponent) {
        this.lazyComponent = lazyComponent;
    }


    public void accessLazyComponent(){
        System.out.println("Accessing LazyComponent..");
        lazyComponent.performAction();
    }
}
