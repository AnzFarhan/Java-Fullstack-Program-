public abstract class Vehicle {
    private String nameVehicle;

    //contructor
    public Vehicle(String nameVehicle){
        this.nameVehicle = nameVehicle;
    }

    public abstract void start();

    public abstract void start(String driverName);

    public String getDetails(){
        return nameVehicle;
    }

    @Override
    public String toString() {
        return "Name Vehicle: " + nameVehicle;
    }
}
