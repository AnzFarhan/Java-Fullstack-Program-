package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;
    @Autowired
    private Wheels wheels;
    @Autowired
    private Driver driver;

    //constructor injection
    @Autowired
    public Car(Engine engine, Wheels wheels, Driver driver){
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public Wheels wheels() {
        return wheels;
    }

    public Engine engine() {
        return engine;
    }

    public Driver driver() {
        return driver;
    }

    //so we can get back the value after using autowired
    public void drive(){
        System.out.println("Driving with engine model: " + engine.getModel() + ", Wheel size: " + wheels.getSize());
    }

    //so we can get back the value after using autowired
    public void printDetails(){
        System.out.println("Car details");
        System.out.println("Driver name: " + driver.getName());
        System.out.println("Engine type: " + engine.getModel());
        System.out.println("Wheel size: " + wheels.getSize());
    }
}
