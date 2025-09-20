package animals;

// Import statements
import java.util.ArrayList;
import java.util.List;

public class lion {
    //variables
    private String name;

    //Constructor
    public lion(String name){
        this.name=name;

    }

    //Method
    public void roar() {
        System.out.println(name + " the lion is roaring!");
    }

    public String getName() {
        return name;
    }
}
