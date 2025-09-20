package com.example.ExerciseBeanConfiguration;

import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private String message = "hello from MyBean";

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
