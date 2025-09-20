//package declaration
package animals;

// Import statements
import java.util.ArrayList;
import java.util.List;

public class elephant {
    //variables
    private String name;

    //Constructor
    public elephant(String name){
        this.name=name;

    }

    //methods
    public void trumpet() {
        System.out.println(name + " the elephant is trumpeting!");
    }

    public String getName() {
        return name;
    }

}
