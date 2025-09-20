public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;

    public void setMake(String make) {
        this.make = make;
//        System.out.println("Brand: " + make);
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
//        System.out.println("Rental Price per day: " + rentalPricePerDay);
    }

    public void setYear(int year) {
        this.year = year;
//        System.out.println("Year: " + year);
    }

    public void setModel(String model) {
        this.model = model;
//        System.out.println("Model: " + model);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }
                            //(Reference any type)
    public void CalculateRentalCost(int days) {//funtional priority
        rentalPricePerDay *= days;
//        System.out.println("Rental cost: " + rentalPricePerDay);
    }
}
