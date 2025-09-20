package Package;

public class Car extends Vehicle {
    private String brand;


    //constructor
    public Car(String name, double maxSpeed, String engineType ,String brand){
        super(name, maxSpeed, engineType); // to call the vehicle constructor from superclass
        this.brand = brand;
    }

    public void getCarDetails(){
        System.out.println(super.getDetails() + "Brand: " + brand + " Premium Quality");
    }
}
