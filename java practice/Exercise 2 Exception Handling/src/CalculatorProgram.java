import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;
        ParseInput PI = new ParseInput();
        PerformTheOperation PO = new PerformTheOperation();


        System.out.println("Welcome to Calculator console-based");
        System.out.println("Input the **exit** when close the program");

        while (continueInput) {
            try {
                System.out.println("Please input number: ");
                String input1 = sc.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    continueInput = false;
                    break;
                }
                int num1 = PI.parseInput(input1);

                System.out.println("Please input another number: ");
                String input2 = sc.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    continueInput = false;
                    break;
                }
                int num2 = PI.parseInput(input2);

                System.out.println("Choose operation +,-,*,/");
                String operation = sc.nextLine();
                if (input1.equalsIgnoreCase("exit")) {
                    continueInput = false;
                    break;
                }
                int resulted = PO.result(num1,num2,operation);
                System.out.println("Result: " + resulted);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Invalid divide by zero.");
            } catch (NoSuchElementException e) {
                System.out.println("No input provided. Please try again");
            } catch (IllegalStateException e) {
                System.out.println("Scanner is closed. Please restart the program.");
                break;
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }

        }
    }
}


