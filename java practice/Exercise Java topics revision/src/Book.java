public class Book {

    private String title;
    private String author;
    private String ISBN;
    private int maxCheckOutDays;

    public Book(String title, String author, String ISBN, int maxCheckOutDays) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.maxCheckOutDays = maxCheckOutDays;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book Details: \n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + ISBN;

    }

}
