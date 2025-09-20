import java.util.List;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota",4);
        Vehicle bike = new Bike("Yamaha", true);
        Vehicle bus = new Bus("ABY",10);

        //add vehicles to a list
        List<Vehicle> vehicles = List.of(car, bike,bus);

        //Create FleetManager and manage the fleet for past the value of list of vehicles
        FleetManager fleetManager = new FleetManager();
        fleetManager.managerFleet(vehicles);

        // Test MileageCalculator and overloaded methods
        System.out.println("Mileage for Car: " + ((Car) car).calculateMileage(500, 25));
        System.out.println("Mileage for Bike: " + ((Bike) bike).calculateMileage(300, 10));
        System.out.println("Mileage for Bus: " + ((Bus) bus).calculateMileage(1000, 100));

        // Test overloaded start methods
        car.start("Farhan");
        bike.start("Bojan");
        bus.start("Capik");
    }
}