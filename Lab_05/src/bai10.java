import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean kt = true;
        for(int j=0;j<n;j++){
            if(a[j] % 5 == 0){
                System.out.println(a[j]);
            }
        }
        if(!kt){
            System.out.println("khong co phan tu nao");
        }
    }
}
