import java.util.Scanner;
public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N (1 <= N <= 9): ");
        int N = sc.nextInt();

        if (N >= 1 && N <= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        } else {
            System.out.println("N phải nằm trong khoảng từ 1 đến 9!");
        }

        sc.close();
    }
}
