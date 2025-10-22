import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // cần khai báo Scanner

        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();

        System.out.println("Ký tự trong tên của bạn là:");
        for (int i = 0; i < ten.length(); i++) {
            System.out.println(ten.charAt(i)); // in từng ký tự trên 1 dòng
        }

        sc.close();
    }
}
