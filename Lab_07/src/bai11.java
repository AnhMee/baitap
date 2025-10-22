import java.util.Scanner;

public class bai11 {
    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int sqrt = (int)Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bai11 b1 = new bai11();
        int n = sc.nextInt();
        System.out.println(b1.isPrime(n));
    }


}
