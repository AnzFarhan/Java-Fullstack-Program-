public class task3 {
    //Takes a StringBuilder parameter and appends text to it
    public static void modifyStringBuilder(StringBuilder str){

        str.append("World!");
    }

    public static void main(String[] args) {
        //DDeclare a StringBuilder variable, initialize it with a value
        StringBuilder strBuilder = new StringBuilder("Hello");

        //print the value of declare variables
        System.out.println(strBuilder);

        //pass the value of StringBuilder to this method by value
        modifyStringBuilder(strBuilder);

        System.out.println(strBuilder);
    }
}
