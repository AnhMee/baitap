import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        System.out.println("so cuoi cua N la: " + (Math.abs(n) % 10));
    }
}
