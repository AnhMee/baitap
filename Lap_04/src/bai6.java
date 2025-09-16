import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();
        int tong = 0;

        for(int i = 0; i < s; i++){
            if(tong + i > s) break;
            tong = tong + i;
        }

        System.out.println(tong);


    }
}
