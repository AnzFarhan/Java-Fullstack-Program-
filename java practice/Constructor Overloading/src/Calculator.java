public class Calculator {
         private int version;
         private String model;

         public Calculator() {
            this.model = "Standard Model";
            this.version = 1;
            System.out.println("Defualt Calculator created.");
         }
    //overloaded constructor with one parameter
         public Calculator(String model) {
             this.model = model;

             System.out.println ("Calculator model Created: " + model);
         }

         //overloaded constructor with two parameter
         public Calculator(String model, int version) {
             this.version = version;
             this.model = model; //set the model name to passed to arguments
             System.out.println ("Calculator created: " + model + " Version: " + version);
         }

        public Calculator(int version){
             this.model = "Basic model";
             this.version = version;
             System.out.println ("Calculator created: model = " + model + " Version = " + version);
        }

        //copy contructor
        public Calculator(Calculator other){
             //copy the model and version from the other Calculator Object
             this.model = other.model;
             this.version = other.version;
            System.out.println ("Calculator created: model = " + model + " Version = " + version);
        }


    // Method to display the calculator details
    public void displayInfo() {//method untuk past the value

             System.out.println("Model: " + model + ", Version: " + version);
    }

    // Static factory method for creating a scientific calculator
    public static Calculator createScientificCalculator(int version) {
        // Create a new Calculator with "Scientific" model and the given version
        Calculator scientificCalculator = new Calculator("Scientific", version);

        // Print a message indicating the scientific calculator has been created
        System.out.println("Scientific Calculator created: Model = " + scientificCalculator.model + ", Version = " + scientificCalculator.version + ".");

        // Return the created Calculator instance value
        return scientificCalculator;
    }
}
