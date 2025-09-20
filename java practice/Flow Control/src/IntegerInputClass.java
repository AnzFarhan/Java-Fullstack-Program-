import java.util.Scanner;

public class IntegerInputClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        String numbers = (n % 2 == 0) ? "Number is Even" : "Number is Odd";

        System.out.println(numbers);
    }
}
