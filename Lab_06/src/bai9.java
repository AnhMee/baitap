import java.util.HashMap;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : freq.keySet()) {
            System.out.println(c + " xuất hiện " + freq.get(c) + " lần");
        }
    }
}
