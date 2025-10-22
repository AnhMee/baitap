import java.util.Scanner;

public class bai1 {
    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bai1 ba = new bai1();

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(ba.sum(a, b));
    }
}
