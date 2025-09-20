public class Book implements Printable, Printable1{
    private String title;
    private String author;

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }


    public void printDetails(){
        System.out.println("Author Book: " + author + "\nTitle Book: " + title);
    }


}
