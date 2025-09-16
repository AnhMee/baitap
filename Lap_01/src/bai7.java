import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so n: ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("so vua nhap nho hon so co 2 chu so: ");

        }else{
            System.out.println("so gan cuoi la: " + ((n / 10) % 10 ));
        }
    }
}
