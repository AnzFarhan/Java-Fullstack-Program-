package Package;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Civic",300, "Japan");
        Car car = new Car("CRV",300,"Japan", "Honda");
        Truck truck = new Truck("Ranger",250, "German", "Ford");

        vehicle.getDetails();
        car.getCarDetails();
        truck.getTruckDetails();

    }
}