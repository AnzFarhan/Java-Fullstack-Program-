import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try (SocialMediaProfile SMP = new SocialMediaProfile()){
            System.out.println("Please enter your name: ");
            SMP.username = sc.nextLine();
            System.out.println("Please enter your age: ");
            SMP.age = sc.nextInt();
            sc.nextLine();
            System.out.println("Please enter your bio: ");
            SMP.bio = sc.nextLine();

            System.out.println("User is valid.");

        }
        catch(IllegalArgumentException | IndexOutOfBoundsException e) {

            System.out.println("Valid error message: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        try {
//            SMP.createProfile("Farhan", 25, "Hello! I love Java."); // Valid input
//            System.out.println("User is valid.");
//
//            SMP.createProfile("", 15, "Bio text."); // Invalid username or // Invalid age or //Invalid Bio
//            System.out.println("User is valid.");
//        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
//            System.err.println("Validation error: " + e.getMessage());
//        } finally{
//            return;
//        }
    }
}