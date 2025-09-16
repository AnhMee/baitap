import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     System.out.print("nhap gio 0 - 23 : ");
     int h =  sc.nextInt();
     System.out.print("nhap phut 0 - 59: ");
     int m = sc.nextInt();

     if(h < 0 || h > 23 || m < 0 || m > 59 ){
         System.out.println("du lieu khong hop le");
     }else{
         if(m < 59){
            m = m + 1;
         }else if(m == 59 && h < 23){
            m = 0;
            h = h + 1;
         }else if(m == 59 && h == 23){
             m = 0;
             h = 0;
         }

         System.out.println(h + " gio " + m + " phut");
     }
    }
}
