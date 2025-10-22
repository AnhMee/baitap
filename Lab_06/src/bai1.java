import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            result += s.charAt(i);
        }
        System.out.println(result);

    }
}
