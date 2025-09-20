public class Mammal extends Animal implements Domesticable {
    private String animalName;
    private int animalAge;
    private String animalType;

    public Mammal(String animalName, int animalAge, String animalType){
        super(animalName,animalAge,animalType);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Roar");
    }

    @Override
    public String habitat(String habitat) {
        System.out.println("Jungle");
        return habitat;
    }

    @Override
    public boolean isFriendly() {
        System.out.println("This bird is Friendly?");
        return false;
    }
}
