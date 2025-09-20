import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Book> checkedOutBooks;

    public User(String name, ArrayList<Book> checkedOutBooks) {
        this.name = name;
        this.checkedOutBooks = checkedOutBooks;
    }

    public String getName() {
        return name;
    }

    public void checkOutBooks(Library library, String ISBN){
        try{
            library.checkOutBook(ISBN, name);
            for (Book book : library.books) {
                if (book.getISBN().equals(ISBN)) {
                    checkedOutBooks.add(book);
                    break;
                }
        }
    } catch (LibraryException e){
            System.out.println(e.getMessage());
        }
    }

    public void returnBook(Library library, String ISBN){
        try{
            library.returnBook(ISBN, name);
            checkedOutBooks.removeIf(book -> book.getISBN().equals(ISBN));
        }catch (LibraryException e){
            System.out.println(e.getMessage());
        }
    }

    // Print all checked-out books
    public void printCheckedOutBooks() {
        if (checkedOutBooks.isEmpty()) {
            System.out.println(name + " has no checked-out books.");
        } else {
            System.out.println(name + "'s Checked-Out Books:");
            for (Book book : checkedOutBooks) {
                System.out.println(book);
            }
        }
    }
}
