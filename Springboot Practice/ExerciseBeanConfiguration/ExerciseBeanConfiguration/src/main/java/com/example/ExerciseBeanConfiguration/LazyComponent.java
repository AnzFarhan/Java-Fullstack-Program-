package com.example.ExerciseBeanConfiguration;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyComponent {

    public LazyComponent(){
        System.out.println("This a LazyComponent initialize");
    }

    public void performAction(){
        System.out.println("Action performed in LazyComponent() ");
    }
}
