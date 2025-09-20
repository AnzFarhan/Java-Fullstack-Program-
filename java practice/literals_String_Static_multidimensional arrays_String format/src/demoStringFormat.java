public class demoStringFormat {
    public static void main(String[] args) {
        // Sample variables
        String name = "Alice";
        int age = 30;
        double salary = 12345.6789;
        String city = "New York";

        // Using String.format to create formatted strings
        String formattedString1 = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formattedString1);

        String formattedString2 = String.format("Salary: $%.2f", salary);
        System.out.println(formattedString2);

        // Padding and alignment
        String formattedString3 = String.format("|%-10s|%10d|", name, age); // Left-align name, right-align age
        System.out.println(formattedString3);

        // Formatting with specific width and precision
        String formattedString4 = String.format("City: %s | Salary: $%10.2f", city, salary);
        System.out.println(formattedString4);

        // Multiple variables
        String formattedString5 = String.format("%-15s | %5d | $%.2f", name, age, salary);
        System.out.println(formattedString5);

        // Formatting with index
        String formattedString6 = String.format("Age: %2$d, Name: %1$s", name, age);
        System.out.println(formattedString6);
    }
}
