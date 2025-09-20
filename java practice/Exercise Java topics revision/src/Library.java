import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> checkedOutBooks = new ArrayList<>();
    ArrayList<String> checkedOutByUser = new ArrayList<>();

    //add book to the libaray
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to the library: " + book.getTitle());
    }

    public void checkOutBook(String ISBN, String Username) throws LibraryException {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {

                //check if book is the spcial book
                if(book instanceof SpecialBook){
                    throw new LibraryException("Book is not checked out: " + book.getTitle());
                }
                //check if the book is already checked out
                if(checkedOutBooks.contains(book)) {
                    throw  new LibraryException("Book is already checked out: " + book.getTitle());
                }

                // Check out the book
                checkedOutBooks.add(book);
                checkedOutByUser.add(Username);
                System.out.println("Book checked out by " + Username + ": " + book.getTitle());
                return;
            }
        }
        throw  new LibraryException("No book found with ISBN: " + ISBN);
    }

    //Return a book
    public void returnBook(String ISBN, String Username) throws LibraryException{
        for(int i = 0; i<checkedOutBooks.size(); i++){
            Book book = checkedOutBooks.get(i);
            if(book.getISBN().equals(ISBN)){
                if(!checkedOutByUser.get(i).equals(Username)){
                    throw new LibraryException("Book was not check out by " + Username +": " + book.getTitle());
                }

                checkedOutBooks.remove(i);
                checkedOutByUser.remove(i);
                System.out.println("Book returned by " + Username + ": " + book.getTitle());
                return;
            }
        }
        throw  new LibraryException("No book found with ISBN: " + ISBN);
    }

    public void printAvailable() {
        System.out.println("Available Books in the Library");
        for (Book book : books) {
            if (!checkedOutBooks.contains(book)) {
                System.out.println(book);
            }
        }
    }
}
