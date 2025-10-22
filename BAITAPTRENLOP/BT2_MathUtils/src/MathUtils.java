public class MathUtils {
    // max cho 2 số nguyên
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // max cho 3 số nguyên
    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    // max cho 2 số thực
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }
}
