import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch  = sc.next().charAt(0);
        switch (ch) {
            case 'N':
                System.out.println("Bắc");
                break;
            case 'S':
                System.out.println("Nam");
                break;
            case 'E':
                System.out.println("Tây");
                break;
            case 'W':
                System.out.println("Đông");
                break;
            default:
                System.out.println("sai gia tri");
        }
    }
}
