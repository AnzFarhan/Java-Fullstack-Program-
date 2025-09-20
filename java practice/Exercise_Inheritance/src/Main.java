import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Car car = new Car();
       Motorcycle motorcycle = new Motorcycle();
       Scanner input = new Scanner(System.in);

       car.setMake("Toyota");
       car.setModel("Camry");
       car.setYear(2020);
       car.setRentalPricePerDay(2500.80);

       motorcycle.setMake("Yamaha");
       motorcycle.setModel("X1R");
       motorcycle.setYear(2020);
       motorcycle.setRentalPricePerDay(180.90);

       car.CalculateRentalCost(4);
       motorcycle.CalculateRentalCost(4);

       System.out.println("** Car Details **");
       System.out.println("Brand Car: " + car.getMake());
       System.out.println("Model Car: " + car.getModel());
       System.out.println("Year Car: " + car.getYear());
       System.out.println("Rental cost:" + car.getRentalPricePerDay());

       System.out.println("** Motorcycle Details **");
       System.out.println("Brand Motor: " + motorcycle.getMake());
       System.out.println("Model Motor: " + motorcycle.getModel());
       System.out.println("Year Motor: " + motorcycle.getYear());
       System.out.println("Rental cost: " + motorcycle.getRentalPricePerDay());

    }
}