import java.util.Scanner;
public class bai12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số nguyên dương N: ");
        int N = sc.nextInt();

        int dem = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                dem++;
            }
        }
        if (N>1 && dem==2){
            System.out.println(N+ " là số nguyên tố.");
        }else {
            System.out.println(N + "Không phải là số nguyên tố.");
        }
        sc.close();
    }
}