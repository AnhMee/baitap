import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String stars = "";
        for (int i = 1; i <= N; i++) {
            stars += "*";
            System.out.println(stars);
        }
    }
}
