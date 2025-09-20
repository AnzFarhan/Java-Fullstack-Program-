public class task2 {
    // takes a String parameter and assigns it a new value
    public static void modifyString(String str){
        str = "Hello, World!";
    }

    public static void main(String[] args) {
        //Declare a String variable, assign it a value
        String str = "Java";

        //print the value String
        System.out.println(str);

        //pass the value of String variable to this method by value
        modifyString(str);

        System.out.println(str);
    }
}
