import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap nam sinh: ");
        int tuoi = sc.nextInt();

        System.out.println("tuoi cua ban o nam 2023 la: " + (2023 - tuoi));
    }
}
