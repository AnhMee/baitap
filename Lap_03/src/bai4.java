import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = sc.nextInt();

        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        System.out.print("Nhap phep tinh (+, -, *, /, %): ");
        char op = sc.next().charAt(0);  // đọc ký tự toán tử

        int result;

        switch (op) {
            case '+':
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-':
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*':
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Loi: khong the chia cho 0");
                } else {
                    double div = (double) a / b;
                    System.out.println(a + " / " + b + " = " + div);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Loi: khong the chia lay du voi 0");
                } else {
                    result = a % b;
                    System.out.println(a + " % " + b + " = " + result);
                }
                break;
            default:
                System.out.println("Phep tinh khong hop le!");
        }
    }
}
