import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int j=0;j<n;j++){
            if(a[j] > max){
                max = a[j];
            }
        }

        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i] == max){
                count++;
            }

        }
        System.out.println(max);
        System.out.println(count);

    }
}
