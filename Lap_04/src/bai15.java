import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập N
        System.out.print("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        int sum = 0; // biến lưu tổng

        // Vòng lặp tính tổng
        for (int i = 1; i <= N; i++) {
            sum += i * (i + 1); // công thức i * (i+1)
        }

        // In kết quả
        System.out.println("Tổng = " + sum);

        sc.close();
    }
}
