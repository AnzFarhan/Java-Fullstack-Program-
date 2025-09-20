package Library;

//the attribute
public class Book {
    private String bookTitle;
    private String author;
    private boolean isBorrowed;

    //contructor
    public Book(String bookTitle, String author, boolean isBorrowed) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    //methods
    //the book has been return and is now available
    public void returnBook() {
         isBorrowed = false;
        System.out.println("The book \"" + bookTitle + "\" has been returned and is now available.");
    }
    //the book has been borrowed and is now is not available
    public void borrowBook() {
        isBorrowed = true;
        System.out.println("The book \"" + bookTitle + "\" has been returned and is now not available.");
    }



    public void displayInfo() {
        System.out.println("The book "+ bookTitle);
        System.out.println("Author: " + author);

        if (isBorrowed) {
            System.out.println("Status : Borrowed");
        }
        if(isBorrowed){
            System.out.println("Status : Available");
        }
    }
}
