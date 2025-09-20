package com.example.ExerciseBeanConfiguration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MyComponent {

    public MyComponent(){

        System.out.println("This is a MyComponent initialize");
    }
}
