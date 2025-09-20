import java.util.NoSuchElementException;

public class PerformTheOperation {

    public int result(int num1, int num2, String operation) throws ArithmeticException, InvalidOperationException {
        switch (operation){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0){
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return num1 / num2;
            default:
                throw new InvalidOperationException("Unsupported operation: Please select a valid operation (+, -, *, /).");
        }

    }

}
