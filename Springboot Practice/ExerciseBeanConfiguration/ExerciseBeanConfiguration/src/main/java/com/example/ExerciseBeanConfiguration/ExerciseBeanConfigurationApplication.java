package com.example.ExerciseBeanConfiguration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExerciseBeanConfigurationApplication implements CommandLineRunner {

	private final InjectClassLazyComponent injectClassLazyComponent;
	private final RequestingComponent requestingComponent;

    public ExerciseBeanConfigurationApplication(InjectClassLazyComponent injectClassLazyComponent, RequestingComponent requestingComponent) {
        this.injectClassLazyComponent = injectClassLazyComponent;
        this.requestingComponent = requestingComponent;
    }

    public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExerciseBeanConfigurationApplication.class, args);
		PrototypeComponent firstInstance = (PrototypeComponent) applicationContext.getBean(PrototypeComponent.class);
		PrototypeComponent secondInstance = (PrototypeComponent) applicationContext.getBean(PrototypeComponent.class);
		MyBean myBean = (MyBean) applicationContext.getBean(MyBean.class);
		System.out.println(firstInstance.doSomething());
		System.out.println(secondInstance.doSomething());
		System.out.println(myBean.toString());

	}
	@Override
	public void run(String... args ) throws Exception{
		System.out.println("Application started.");
		System.out.println("Now accessing the LazyComponent:");
		injectClassLazyComponent.accessLazyComponent();

	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext context) {
//		return args -> {
//			MyBean myBean = context.getBean(MyBean.class);
//			System.out.println("Retrieved Bean: " + myBean);
//		};
//	}



}
