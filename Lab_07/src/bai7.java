import java.util.Scanner;

public class bai7 {
    public void ten(){
        Scanner sc = new Scanner(System.in);
        System.out.print("vui long nhap ten cua ban: ");
        String s = sc.nextLine();
        System.out.println("Hello " + s);
    }
    public static void main(String[] args) {
        bai7 b7 = new bai7();
        b7.ten();
    }
}
