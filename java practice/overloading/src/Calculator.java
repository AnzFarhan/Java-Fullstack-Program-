public class Calculator {
    //simple method, such as add, which takes two int parameters and returns their sum.
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return (a + b);
    }

//    public static void add(double a, double b) {
//        System.out.println(a + b);
//    }
//
//    public static void add(int a, int b, int c) {
//        System.out.println(a + b + c);
//
//    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
    //
    public String add(String a, String b) {
        return a + b;
    }

    public double add(float a, float b) {
        return (double) a + b;
    }

////error and Cannot compile because the overloaded same parameters
//    public int add(int a, int b){
//        return a - b;
//    }
}

