public class Car extends Vehicle implements MileageCalculator {
    int numberOfDoors;

    public Car(String nameVehicle, int numberOfDoors){
        super(nameVehicle);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        //logic operations
        System.out.println("Car start with ignition");
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }

    @Override
    public double calculateMileage(int distance, int fuelUsed) {
        return (double) distance / fuelUsed;
    }

    //overloading method
    public void start(String driverName) {
        System.out.println(driverName + " Start the car");
    }

    @Override
    public String toString() {
        return super.toString() + " Type: Car, Number of doors: " + numberOfDoors;
    }
}
