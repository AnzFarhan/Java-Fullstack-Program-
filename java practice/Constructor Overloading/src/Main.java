import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //defautl calculator
        Calculator defaultCalculator = new Calculator();

        //Model Calculator Cretaed from overloaded with one parameter
        Calculator modelCalculatorCreated = new Calculator("Graphic Calculator");

        //create constructor using the constructor with a model name
        Calculator scientificCalculator = new Calculator("Scientific Calculator Model 3000", 3);

        Calculator modelVersionCreated = new Calculator(2);

        //Create a copy of the first Calculator object using the copy constructor
        Calculator calcopy = new Calculator(modelCalculatorCreated);


        // Use the static factory method to create a scientific calculator
        Calculator scientificCalc = Calculator.createScientificCalculator(3);
        // Display the details of the created calculator
        defaultCalculator.displayInfo();
        modelCalculatorCreated.displayInfo();
        scientificCalculator.displayInfo();
        modelVersionCreated.displayInfo();
        calcopy.displayInfo();
        scientificCalc.displayInfo();
        defaultCalculator.println();
    }

}