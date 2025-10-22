import java.util.Scanner;

public class bai6 {
    public int uocso(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("cac so la: " + i);
                count++;

            }
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bai6 b6 = new bai6();
        System.out.println(b6.uocso(n));
    }
}
