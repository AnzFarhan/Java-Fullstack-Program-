public class Boot {
    static String s;

    static {
        s = "";
    }

    {
        System.out.print("shinier ");
    }

    static {
        System.out.print( s.concat("better "));
    }

    Boot() {
        System.out.print( s.concat("bigger "));
    }

    public static void main(String[] args) {
        new Boot();
        System.out.println("boot");
    }

}
