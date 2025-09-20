import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scaneer = new Scanner(System.in);


        try{
            Readable readable = new FileReader("c://telegram"); //polymorphism method for create new object
            Scanner sc = new Scanner(readable);//to read object from text file(use the constructor that accepts a File object)

            System.out.println("Please select your file you want: ");
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file was not found. Please check the file path.");
        }

        finally{
                scaneer.close();
        }
    }
}
