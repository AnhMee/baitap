import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
