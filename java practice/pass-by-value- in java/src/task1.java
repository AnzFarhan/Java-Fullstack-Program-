public class task1 {
    //takes an int parameter and asign new value
    public static void modifyInt(int num){
       num = 99;
   }

   public static void main(String[] args) {
        int num = 10;
        //print the value of int num = 10
        System.out.println(num);

        //pass the value of num to this method by value
        modifyInt(num);

        System.out.println(num);

   }
}
