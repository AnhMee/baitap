import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        if (N > 0) {
            System.out.print("Các ước số của " + N + " là: ");
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) { // nếu N chia hết cho i
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("N phải là số nguyên dương!");
        }

        sc.close();
    }
}
