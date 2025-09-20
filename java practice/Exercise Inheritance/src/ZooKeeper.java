import java.util.InputMismatchException;

public class ZooKeeper {
    public void feedAnimal(Animal animal){
       if(animal instanceof Mammal){
           System.out.println("Feeding meat to mammal");
       }
       if(animal instanceof Bird){
           System.out.println("Feeding meat to bird");
       }
       if(animal instanceof Reptile){
           System.out.println("Feeding meat to reptile");
       }
    }

    public void assignHabitat(Animal animal, String habitat){
        try{
            if(animal instanceof Mammal && !habitat.equalsIgnoreCase("Jungle")) {
                throw new HabitatMismatchException("Wrong habitat for Mammal animal");
            }
            else if(animal instanceof Bird && !habitat.equalsIgnoreCase("Air")) {
                throw new HabitatMismatchException("Wrong habitat for Bird animal");
            }
            else if(animal instanceof Reptile && !habitat.equalsIgnoreCase("Desert")) {
                throw new HabitatMismatchException("Wrong habitat for Reptile animal");
            }
            else {
                System.out.println("Habitat assigned successfully");
            }

        } catch(HabitatMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
