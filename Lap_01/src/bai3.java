import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dai = sc.nextDouble();
        double rong = sc.nextDouble();

        System.out.println("Chu Vi HCN: " + (2 * (dai + rong)) );
        System.out.println("Dien Tich: " + (dai * rong) );
    }
}
