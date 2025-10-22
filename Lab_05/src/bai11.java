import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int max = a[0];
        int index = 0;
        for(int i = 0; i < n; i++){
            if(a[i] >= max){
                max = a[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
