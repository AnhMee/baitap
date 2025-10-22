public class TestMathUtils {
    public static void main(String[] args) {
        // Kiểm thử với số dương
        System.out.println("Max(5, 7): " + MathUtils.max(5, 7));
        System.out.println("Max(5, 7, 3): " + MathUtils.max(5, 7, 3));
        System.out.println("Max(5.5, 2.3): " + MathUtils.max(5.5, 2.3));

        // Kiểm thử với số âm
        System.out.println("Max(-5, -7): " + MathUtils.max(-5, -7));
        System.out.println("Max(-5, 7): " + MathUtils.max(-5, 7));
        System.out.println("Max(-5, -7, -2): " + MathUtils.max(-5, -7, -2));
        System.out.println("Max(-3.5, 2.1): " + MathUtils.max(-3.5, 2.1));
    }
}
