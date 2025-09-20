package com.example.ExerciseBeanConfiguration;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestingComponent {

    private final ApplicationContext applicationContext;
    private final PrototypeComponent prototypeComponent;

    public RequestingComponent(ApplicationContext applicationContext, PrototypeComponent prototypeComponent) {
        this.applicationContext = applicationContext;
        this.prototypeComponent = prototypeComponent;
    }

    public void RequestPrototypeInstances(){
        PrototypeComponent firstInstance = applicationContext.getBean(PrototypeComponent.class);
        firstInstance.doSomething();

        PrototypeComponent secondInstance = applicationContext.getBean(PrototypeComponent.class);
        secondInstance.doSomething();
    }
}
