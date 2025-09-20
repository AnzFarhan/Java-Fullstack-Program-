import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ParseInput {
    public static int parseInput(String input) throws NoSuchElementException, InputMismatchException {
        if (input.trim().isEmpty()){
            throw new NoSuchElementException("Input the empty");
        }

        try{
            return Integer.parseInt(input.trim());
        }
        catch(NumberFormatException e ){
            throw new InputMismatchException("Invalid number format.");
        }
    }

}
