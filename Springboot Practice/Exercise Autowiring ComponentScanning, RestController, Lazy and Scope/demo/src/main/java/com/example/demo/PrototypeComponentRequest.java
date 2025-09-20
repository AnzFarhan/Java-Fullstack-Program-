package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

//Create another component that requests PrototypeComponent
public class PrototypeComponentRequest {

    @Autowired
    private ApplicationContext applicationContext;

    //multiple times and verify that each request results in a new instance.
    public void requestPrototype(){
        PrototypeComponent prototype1 = applicationContext.getBean(PrototypeComponent.class);
        System.out.println("Requested PrototypeComponent instance: " + prototype1);

        PrototypeComponent prototype2 = applicationContext.getBean(PrototypeComponent.class);
        System.out.println("Requested PrototypeComponent instance: " + prototype2);

        PrototypeComponent prototype3 = applicationContext.getBean(PrototypeComponent.class);
        System.out.println("Requested PrototypeComponent instance: " + prototype3);
    }
}
