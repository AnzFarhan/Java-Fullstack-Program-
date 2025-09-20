public class Bus extends Vehicle implements MileageCalculator{
    int seatingCapacity;

    public Bus(String nameVehicle, int seatingCapacity){
        super(nameVehicle);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void start() {
        //logic operations
        System.out.println("Bus start with diesel starter");
    }

    @Override
    public String getDetails() {
        return super.getDetails();
    }

    @Override
    public double calculateMileage(int distance, int fuelUsed) {
        return (double) distance/fuelUsed;
    }

    //overloading method
    public void start(String driverName) {
        //logical operations
        System.out.println(driverName + " Start the bus");
    }

    @Override
    public String toString() {
        return super.toString() + " Type: Bus, Seat capacity: " + seatingCapacity;
    }
}
