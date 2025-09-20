public class QTest {
    public static void main(String args[]) {
        int i;
        int j = 0;
        for (i = 1; i <= 10; i++,j++) {
            if (i == 5) {
                // breaking the loop
                break;
            }
            System.out.println(i+" "+j);
        }

    }
}