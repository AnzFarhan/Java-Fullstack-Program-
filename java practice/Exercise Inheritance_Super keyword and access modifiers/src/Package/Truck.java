package Package;

public class Truck extends Vehicle {

    private String brand;
    //constructor
    public Truck(String name, double maxSpeed, String engineType ,String brand){
        super(name, maxSpeed, engineType); // to call the vehicle constructor from superclass
        this.brand = brand;
    }

    public void getTruckDetails(){
        System.out.println(super.getDetails() + "Brand: " + brand + " Premium Quality");
    }
}
