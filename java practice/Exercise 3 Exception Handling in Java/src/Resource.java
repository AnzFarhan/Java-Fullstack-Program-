import java.lang.AutoCloseable;

public class Resource implements AutoCloseable {


    public void use(){
        System.out.println("Resource is being used.");
    }

    @Override
    public void close()  {
        System.out.println("Resource is being closed.");
    }
}
