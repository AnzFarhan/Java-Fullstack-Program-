public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(name + " Meow");
    }

    public void makeSound(int numberOfTimes){
       for(int i = 0; i < numberOfTimes ; i++){
           System.out.println("Meow");
       }
    }

}
