public class Main {


    public static void main(String[] args) {
        //call each overloaded version of add at Calculator class
        Calculator calculator = new Calculator();

       System.out.println("Print value of int: " + calculator.add(10, 20));
       System.out.println("Print value of double: " + calculator.add(10.5, 20.5));
       System.out.println("Print value of 3 int numbers: " + calculator.add(10, 20, 30));
       System.out.println("Print value of String: " + calculator.add(" Hai", " Farhan"));
       System.out.println("Print value of double but in float: " + calculator.add(10.1234, 20.1234));

       //optional try calling add method  with mixed types, such as one int and one double
        System.out.println("Print value of int: " + calculator.add(10, 90.056));

        // Attempting to call an overloaded method with incompatible types
        // Uncommenting the following line will result in a compilation error
        // System.out.println("Add incompatible types: " + calculator.add("Hello", 5)); // This will not compile
    }

}