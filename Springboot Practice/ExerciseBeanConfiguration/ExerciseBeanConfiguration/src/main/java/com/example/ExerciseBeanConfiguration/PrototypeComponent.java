package com.example.ExerciseBeanConfiguration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeComponent {

    public PrototypeComponent(){
        System.out.println("PrototypeComponent instance created");
    }

    public String doSomething(){
        return ("Performing action in PrototypeComponent1");
    }
}
