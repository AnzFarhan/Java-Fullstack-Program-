//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Library.Book;

public class Main {
    public static void main(String[] args) {
        //two instances of the book class
        Book book1 = new Book("The Great Gasby", "Farhan", false);
        Book book2 = new Book("Top Gun", "Farhan", false);

        // Display information for each book
        System.out.println("Initial Book Status:");
        book1.displayInfo();
        book2.displayInfo();

        // Borrow the first book and display status
        System.out.println("\nBorrowing the first book:");
        book1.borrowBook();
        book1.displayInfo();

        // Try to borrow the same book again to show unavailable status
        System.out.println("\nTrying to borrow the first book again:");
        book1.borrowBook();

        // Return the first book and display status
        System.out.println("\nReturning the first book:");
        book1.returnBook();
        book1.displayInfo();
    }

    }
