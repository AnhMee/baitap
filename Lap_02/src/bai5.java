import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int diem = sc.nextInt();

        if (diem < 0 || diem > 10){
            System.out.println("nhap diem sai vui long nhap lai");
        }
    }
}
