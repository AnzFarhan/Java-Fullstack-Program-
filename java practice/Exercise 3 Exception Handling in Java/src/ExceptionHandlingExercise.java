public class ExceptionHandlingExercise {
    public static int calculate(int a, int b) {
        try (Resource resource = new Resource()) {
            resource.use(); // Using the resource
            if (b == 0) {
                throw new ArithmeticException("Invalid! divided by 0 is not allowed");
            }
            return a / b;
        }
    }

    public static int parseData(String data) {
        return Integer.parseInt(data);
    }

    public static void main(String ... farhan){
        try {
//            // Simulate NumberFormatException
            System.out.println("Parsing invalid data...");
            int number = parseData("abc"); // Invalid string
            System.out.println("Parsed number: " + number);

            // Simulate ArithmeticException
            System.out.println("Performing division...");
            int result = calculate(10, 2); // Division by zero
            System.out.println("Division result: " + result);

        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            // Indicate the end of exception handling
            System.out.println("End of exception handling.");
        }
    }
}


