import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] a  = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum = 0;
        for(int j=0;j<n;j++){
            if(a[j]%2==0){
                sum +=a[j];
            }

        }
        System.out.println(sum);
    }
}
