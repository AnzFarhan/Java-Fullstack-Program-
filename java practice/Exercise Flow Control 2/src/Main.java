import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter alphabetic: ");
        String alpha = sc.nextLine();
        int vowel = 0;

        for(int i = 0 ; i < alpha.length() ; i++){
            char currentChar = alpha.charAt(i);

            if(Character.isAlphabetic(currentChar)){
                if ("aeiouAEIOU".indexOf(currentChar) != -1) {
                    vowel++; // Increment vowel count
                }
                else{
                    //skip non-alphabetic characters
                    continue;
                }
            }

            System.out.println("Number of vowels: " + vowel);
        }
    }
}