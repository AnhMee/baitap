import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =  sc.nextInt();

        switch(n){
            case 1:
                System.out.println("một");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bốn");
                break;
            case 5:
                System.out.println("năm");
                break;
            case 6:
                System.out.println("sáu");
                break;
            case 7:
                System.out.println("bảy");
                break;
            case 8:
                System.out.println("tám");
                break;
            case 9:
                System.out.println("chín");
                break;
            default:
                System.out.println("ngoai pham vi");
        }
    }
}
