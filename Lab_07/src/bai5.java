import java.util.Scanner;

public class bai5 {
    public static long giaithua(int n){
        long kq = 1;
        for(int i=1;i<=n;i++){
            kq *= i;
        }
        return kq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(giaithua(n));
    }
}
