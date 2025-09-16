import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b)) {
            System.out.println(a);
        } else if (a.compareTo(b) > 0) {  // a > b
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
