//public class Number {
//    public static void main(String[] args) {
//
//        Integer[] numbers = new Integer[5];
//
//        //iniatialize array elements elements using auto-boxing
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//
//
//        //calculate the sum and average
//        int sum = 0;
//
//        //adding each value to a sum variable
//        sum += numbers[0];
//        sum += numbers[1];
//        sum += numbers[2];
//        sum += numbers[3];
//        sum += numbers[4];
//
//        double average = sum / (double)numbers.length;
//
//        System.out.println("The sum is " + sum);
//        System.out.println("sum/number of elements in the array " + average);
//        System.out.println("How many elements are inside the array " + numbers.length);
//    }
//}

public class Number {
    public static void main(String[] args) {


                // Create an array of String with 3 elements
                String[] names = new String[3];

                // Initialize the array elements
                names[0] = "Bob";
                names[1] = "Dima";
                names[2] = "Suzan";

                // Print the values of the array
                for (String name : names) {
                    System.out.println(names.length);
                }
        }
    }
