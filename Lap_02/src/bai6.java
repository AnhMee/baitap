import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
