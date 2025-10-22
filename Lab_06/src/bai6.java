import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (!seen[c - 'a']) {
                    seen[c - 'a'] = true;
                    count++;
                }
            }
        }

        if (count == 26) {
            System.out.println("Chuỗi là pangram");
        } else {
            System.out.println("Chuỗi không phải pangram");
        }
    }
}
