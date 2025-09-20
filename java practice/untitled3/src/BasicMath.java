public class BasicMath {
    static int subtract(int a, int b) {
        return a - b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }
}
