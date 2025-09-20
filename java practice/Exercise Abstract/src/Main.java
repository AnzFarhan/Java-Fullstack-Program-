import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("");
        Dog dog = new Dog("");

//        Animal[] animals = new Animal[4];
//
//        animals[1] = new Cat("Oyen");
//        animals[2] = new Dog("bull");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Joji"));
        animals.add(new Cat("Oyen"));
        animals.add(new Dog("Bull"));
        animals.add(new Cat("Comot"));
        
        for(Animal animal : animals){
            animal.makeSound();
        }

    }
}