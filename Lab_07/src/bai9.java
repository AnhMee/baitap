import java.util.Scanner;

public class bai9 {

    public int uocchung(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        bai9 b9 = new bai9();

        System.out.println(b9.uocchung(a, b));
    }
}
