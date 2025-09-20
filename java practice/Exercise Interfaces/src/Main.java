public class Main {
    public static void main(String[] args) {

        Book book = new Book("You are my sun shine", "Susan");
        Magazine mag = new Magazine("49(4)", "Maclean's");
        Library lib = new Library();

        book.printDetails();
        mag.printDetails();
        //to print the details of book/magazine use method passed object
        lib.printDetails(book);
    }
}