public class literalsStringCreatedStringDemo {

        public static void main(String[] args) {
            // String literals
            String literal1 = "Hello";
            String literal2 = "Hello";

            // Strings created with the new keyword
            String newString1 = new String("Hello");
            String newString2 = new String("Hello");

            // Comparing references (memory addresses)
            System.out.println("Comparing string literals:");
            System.out.println("literal1 == literal2: " + (literal1 == literal2)); // true
            System.out.println("newString1 == newString2: " + (newString1 == newString2)); // false

            // Comparing values (content)
            System.out.println("\nComparing values:");
            System.out.println("literal1.equals(literal2): " + literal1.equals(literal2)); // true
            System.out.println("newString1.equals(newString2): " + newString1.equals(newString2)); // true

            // Comparing literal and new string
            System.out.println("\nComparing literal with new string:");
            System.out.println("literal1 == newString1: " + (literal1 == newString1)); // false
            System.out.println("literal1.equals(newString1): " + literal1.equals(newString1)); // true
        }
}
