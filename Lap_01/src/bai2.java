import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r =  sc.nextDouble();

        System.out.println("Chu Vi: " + (2 * r * Math.PI));
        System.out.println("Dien Tich: " + (r * r * Math.PI) );
    }
}
