package Package;

public class Vehicle {
    protected String name;
    public double maxSpeed;
    private String engineType;

    //constructor
    public Vehicle(String name, double maxSpeed, String engineType){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getEngineType(){
        return engineType;
    }

    //functional to return value of formatted string containing vehicle details
    protected String getDetails(){
        return "Vehicle details: " + name + " " + maxSpeed + " ";
//        setName("Toyota");
//        setMaxSpeed(300);
    }
}
