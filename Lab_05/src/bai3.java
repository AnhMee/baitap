import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương N
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        int[] a = new int[N];

        // Nhập N phần tử
        System.out.println("Nhập " + N + " phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        // In mảng theo thứ tự ngược lại, cách nhau bằng dấu cách
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i > 0) {
                System.out.print(" "); // thêm dấu cách giữa các số
            }
        }

        sc.close();
    }
}
