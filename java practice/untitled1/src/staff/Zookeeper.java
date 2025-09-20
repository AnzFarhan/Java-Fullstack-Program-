package staff;

//import statements
import animals.lion;
import animals.elephant;


public class Zookeeper {
    //variables
    private String name;

    //constructor
    public Zookeeper(String name)
    {
        this.name=name;

    }

    //methods
    public void feedLion(lion lion)
    {
        System.out.println("Zookeeper: "+name+ "is feeding "+lion.getName()+" the lion");
        lion.roar();
    }

    public void feedElephant(elephant elephant)
    {
        System.out.println("Zookeeper: "+name+ "is feeding "+elephant.getName()+" the elephant");
        elephant.trumpet();
    }
}
