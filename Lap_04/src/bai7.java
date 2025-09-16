import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        do{
            System.out.print("nhap n (> 0)");
            n=sc.nextInt();
        }while(n <= 0);
        System.out.println("ket qua la " + n);
    }

}
