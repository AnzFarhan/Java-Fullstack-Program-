import java.util.List;

//polymorphism to ensure the correct implementation is called for each vehicle.
public class FleetManager {
    public void managerFleet(List<Vehicle> vehicles){
        for(Vehicle vehicle : vehicles){
            vehicle.start();
            System.out.println(vehicle);
        }


    }
}
