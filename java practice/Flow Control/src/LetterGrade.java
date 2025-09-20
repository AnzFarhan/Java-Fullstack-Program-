import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        String grade = sc.nextLine().toUpperCase();
        int numericalGrade = 0;
        switch (grade){
            case "A":
                numericalGrade = 90;
                break;
            case "B":
                numericalGrade = 80;
                break;
            case "C":
                  numericalGrade = 70;
                  break;
            case "D":
                   numericalGrade = 60;
                  break;
            case "E":
                   numericalGrade = 50;
                   break;
            case "F":
                numericalGrade = 40;
                break;

            default:
                System.out.println("Invalid grade");
        }

        System.out.println("The letter grade " +grade+ " is " + numericalGrade);

    }
}
