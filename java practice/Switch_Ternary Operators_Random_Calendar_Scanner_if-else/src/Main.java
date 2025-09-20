import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        String[] months = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November","December"};

        //1=SUNDAY 2=MONDAY 3=TUESDAY 4=WEDNESDAY 5=THURSDAY 6=FRIDAY 7=SATURDAY
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//        String DayOfWeekString = days[dayOfWeek];

        String dayType = (dayOfWeek == cal.SATURDAY || dayOfWeek == cal.SUNDAY )
                ? "Its a Weekend" : "Its a Weekday";

        System.out.println("Today " + dayType);

        //Random in generate number of month using random method
        int randomMonth = rand.nextInt(12) + 1;
        //print massage of the random number
        System.out.println("Random month in number 1 to 12 is: " + randomMonth);
        //Print massage for input the months
        System.out.println("Guess the month for the number: " + randomMonth + " :");

        //get user input
        String userInput = sc.nextLine();
        //convert user input to proper case for comparison
        String correctMonth = months[randomMonth - 1];

        /*switch statement to compare the user's input to the correct
          answer based on the generated month number. */
        switch (userInput.equalsIgnoreCase(correctMonth)? 1 : 0){
            case 1:
                System.out.println("Congrats!! You enter the correct month!!");
                break;
                case 0:
                    if(userInput.equalsIgnoreCase("January") || userInput.equalsIgnoreCase("February") || userInput.equalsIgnoreCase("March") || userInput.equalsIgnoreCase("April")|| userInput.equalsIgnoreCase("May")|| userInput.equalsIgnoreCase("June")) {
                        System.out.println("Too early!");
                    }
                    else if (userInput.equalsIgnoreCase("July")|| userInput.equalsIgnoreCase("August")|| userInput.equalsIgnoreCase("September") ||userInput.equalsIgnoreCase("October") || userInput.equalsIgnoreCase("November") || userInput.equalsIgnoreCase("December")) {
                        System.out.println("Too late!");
                    }
                    break;
        }

        if(userInput.equalsIgnoreCase(months[randomMonth - 1])) {
            System.out.println("Correct! The month is " + months[randomMonth - 1] + ".");
        }
        else{
            System.out.println("Wrong! The Correct month was " + months[randomMonth - 1] + ".");
        }
    }
}