import java.util.Random;
import java.util.Scanner;

public class guesGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randomNum = rand.nextInt(100) + 1;

        int guess;
        int attemps = 0;

        do {

            System.out.println("The number is 1 to 100 but you need Guessing" + randomNum);

            System.out.println("Guess the invisible of number until you get:");
            guess = sc.nextInt();
            attemps++;

            if(guess > randomNum){
                System.out.println("Too high");

            }
            else if(guess < randomNum){
                System.out.println("Too low");

            }
            else{
                System.out.println("Congratulations! You have guessed the number in " + attemps + " attempts");
            }
        }
        while (guess != randomNum);
    }
}
