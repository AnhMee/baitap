import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println("Chuỗi không đối xứng");
        }
    }
}
