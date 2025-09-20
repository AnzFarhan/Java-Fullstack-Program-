public abstract class Animal {
    private String animalName;
    private int animalAge;
    private String animalType;
    private static int totalNumberAnimalsCreated = 0;

    public Animal(String animalName, int animalAge, String animalType){
        this.animalAge = animalAge;
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void makeSound(){
        System.out.println("Some generic animal sound");
    }

    public abstract String habitat(String habitat);

    static int totalOfAnimals(int totalNumberAnimalsCreated){
        return totalNumberAnimalsCreated;
    }

    public final String generalDescriptionAnimals(){
        return "Animals are multicellular organisms that exhibit a variety of behaviors.";
    }
}
