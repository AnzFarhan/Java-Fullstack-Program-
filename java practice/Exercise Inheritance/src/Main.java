import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal mammal = new Mammal("Jiji",32,"Mammal");
        Animal bird = new Bird("Ana",32,"Mammal");
        Animal reptile = new Reptile("JJ",32,"Mammal");


        // Create a ZooKeeper instance
        ZooKeeper zooKeeper = new ZooKeeper();

        // Demonstrate polymorphism with ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(mammal);
        animals.add(bird);
        animals.add(reptile);

        // Iterate and invoke behaviors
        for (Animal animal : animals) {
            System.out.print("Animal sound: ");
            animal.makeSound();
            zooKeeper.feedAnimal(animal);
        }

        System.out.println();

        // Assign habitats and handle exceptions
        zooKeeper.assignHabitat(mammal, "Land");  // Successful
        zooKeeper.assignHabitat(bird, "Water");  // Throws exception
        zooKeeper.assignHabitat(reptile, "Swamp"); // Successful // Throws exception
    }
}
