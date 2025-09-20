import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@ComponentScan
public class MyComponent {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(MyComponent.class);

    public MyComponent(){

        logger.info("MyComponent has been instantiated by the Spring Context!");
    }
}
