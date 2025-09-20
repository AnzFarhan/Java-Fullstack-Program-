public class Bike extends Vehicle implements MileageCalculator{
    boolean helmetRequired;

    public Bike(String nameVehicle, boolean helmetRequired){
        super(nameVehicle);
        this.helmetRequired = helmetRequired;
    }
    @Override
    public void start() {
        //logic operations
        System.out.println("Bike start with kick starter or button starter");
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
        System.out.println(driverName + " Start the bike");
    }

    @Override
    public String toString() {
        return super.toString() + " Type: Bike, Helmet Required: " + helmetRequired;
    }
}
