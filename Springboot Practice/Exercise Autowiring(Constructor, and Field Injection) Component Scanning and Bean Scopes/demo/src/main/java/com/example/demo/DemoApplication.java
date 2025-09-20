package com.example.demo;

import com.example.demo.customer.CustomerService;
import com.example.demo.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.customer","com.example.demo.order"})

public class DemoApplication {

	@Autowired
	private Person person1;
	@Autowired
	private Person person2;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CustomerService customerService;


	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(DemoApplication.class, args);

		Car car = applicationContext.getBean(Car.class);
		Engine engine = applicationContext.getBean(Engine.class);
		Wheels wheels = applicationContext.getBean(Wheels.class);
		Driver driver = applicationContext.getBean(Driver.class);
		DemoApplication app = applicationContext.getBean(DemoApplication.class);
		engine.setModel("V8 turbo");
		wheels.setSize(18);
		driver.setName("Farhan");
		app.checkBeanScope();
		app.runApp();


//		System.out.println("Engine model: " + car.engine().getModel());
//		System.out.println("Wheels size: " + car.wheels().getSize());
//		car.drive();

		System.out.println("Engine model: " + engine.getModel());
		System.out.println("Wheels Size: " + wheels.getSize());
		System.out.println("Driver name: " + driver.getName());
		car.printDetails();

	}

	public void checkBeanScope() {
		// Print details to check instance references
		System.out.println("Person 1: " + person1);
		System.out.println("Person 2: " + person2);

		// Check if person1 and person2 are the same
		System.out.println("Are person1 and person2 the same? " + (person1 == person2));
	}

	public void runApp() {
		System.out.println(orderService.orderService());
		System.out.println(customerService.customerService());
	}

}
