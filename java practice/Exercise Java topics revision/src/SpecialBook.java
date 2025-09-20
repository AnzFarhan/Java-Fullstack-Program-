public class SpecialBook extends Book {

    public SpecialBook(String title, String author, String ISBN, int maxCheckOutDays) {
        super(title, author, ISBN, maxCheckOutDays);
    }

    @Override
    public String toString() {
        return "This is Special Book -  ** Cannot Be Checkout ** \n" +
                super.toString();
    }
}
