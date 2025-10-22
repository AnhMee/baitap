import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean hasDigit = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (hasDigit) {
            System.out.println("Chuỗi có chứa ký tự số.");
        } else {
            System.out.println("Chuỗi không chứa ký tự số.");
        }
    }
}
