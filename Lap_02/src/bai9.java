import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n =sc.nextInt();
        if(n < 0){
            System.out.println("NO");
        }else{
            int k = (int) Math.sqrt(n);
            if(k*k==n){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
