import java.util.Scanner;

public class bai2 {
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

        // In mảng trên 1 dòng, cách nhau bằng dấu cách
        for (int i = 0; i < N; i++) {
            System.out.print(a[i]);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
