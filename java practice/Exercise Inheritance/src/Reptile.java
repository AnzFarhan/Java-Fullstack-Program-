public class Reptile extends Animal implements Domesticable{

    public Reptile(String animalName, int animalAge, String animalType){
        super(animalName,animalAge,animalType);

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Hiss");
    }

    @Override
    public String habitat(String habitat) {
        System.out.println("Desert");
        return habitat;
    }

    @Override
    public boolean isFriendly() {
        System.out.println("This bird is Friendly?");
        return false;
    }
}
