public class Magazine implements Printable,Printable1{
    private String issueNumber;
    private String title;

    public Magazine(String issueNumber, String title){
        this.issueNumber = issueNumber;
        this.title = title;
    }


    public void printDetails(){
        System.out.println("Issue Number: " + issueNumber + "\nTitle Book: " + title);
    }
}
