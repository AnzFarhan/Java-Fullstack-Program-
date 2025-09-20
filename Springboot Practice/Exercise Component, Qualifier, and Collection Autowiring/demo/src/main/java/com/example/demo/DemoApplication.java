package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
@Component
public class DemoApplication {



	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
