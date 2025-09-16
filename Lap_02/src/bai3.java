import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("la so chan");
        }else{
            System.out.println("la so le");
        }
    }
}
