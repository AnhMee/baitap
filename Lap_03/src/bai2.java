import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gioitinh = sc.nextInt();
         switch(gioitinh){
             case 0:
                 System.out.println("nam");
                 break;
             case 1:
                 System.out.println("nu");
                 break;
             default:
                 System.out.println("khong xac dinh");
         }

    }
}
