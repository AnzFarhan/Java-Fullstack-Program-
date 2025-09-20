//import java.util.InputMismatchException;
//import java.util.NoSuchElementException;
//import java.util.Scanner;
//
//public class ExceptionHandlingExercise1 {
//
//    private int a;
//    private int b;
//
//    public int numbers(int a, int b) {
//        return a / b;
//    }
//
//    public static void main(String... farhan) {
//
//        try {
//            ExceptionHandlingExercise1 num = new ExceptionHandlingExercise1();
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the integer: ");
//            String num1 = sc.nextLine();
//            int number1 = parseInput(num1);
//            System.out.println("Enter the integer: ");
//            String num2 = sc.nextLine();
//            int number2 = parseInput(num2);
//
//            int result = num.numbers(number1, number2);
//            System.out.println("Result: " + result);
//
//            if (num.b == 0) {
//                throw new ArithmeticException("Cannot divide by zero");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        calculate();
//    }
//
//    //method parse data
//    public static int parseInput(String input) throws NoSuchElementException, InputMismatchException {
//        if (input.trim().isEmpty()) {
//            throw new NoSuchElementException("Input the empty");
//        }
//
//        try {
//            return Integer.parseInt(input.trim());
//        } catch (NumberFormatException e) {
//            throw new InputMismatchException("Invalid number format.");
//        }
//    }
//
//    public static void calculate() {
//        System.out.println("Starting calculation...");
//
//        // Using a try-with-resources block
//        try (Resource resource = new Resource()) {
//            // Using the resource
//            resource.use();
//        } catch (Exception e) {
//            // Handle any exceptions
//            System.out.println("An exception occurred: " + e.getMessage());
//        }
//
//        System.out.println("Calculation complete.");
//    }
//}
//
