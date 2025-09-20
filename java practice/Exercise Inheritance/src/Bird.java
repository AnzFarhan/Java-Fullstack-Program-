public class Bird extends Animal implements Domesticable{

    public Bird(String animalName, int animalAge, String animalType){
        super(animalName,animalAge,animalType);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Chirp");
    }

    @Override
    public String habitat(String habitat) {
        System.out.println("Air");
        return habitat;
    }

    @Override
    public boolean isFriendly() {
        System.out.println("This bird is Friendly?");
        return true;
    }
}
