public class RegularBook extends Book{

    private int maxCheckOutDays;

    public RegularBook(String title, String author, String ISBN, int maxCheckOutDays) {
        super(title, author, ISBN, maxCheckOutDays);
        this.maxCheckOutDays = maxCheckOutDays;
    }

    public int getMaxCheckOutDays() {
        return maxCheckOutDays;
    }

    public void setMaxCheckOutDays(int maxCheckOutDays) {
        this.maxCheckOutDays = maxCheckOutDays;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Maximum Checkout days: " + maxCheckOutDays;
    }
}
