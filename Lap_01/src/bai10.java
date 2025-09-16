import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'y'){
            char next =(char) (ch + 1);
            System.out.println("chuoi tiep theo la: " + next);
        }else{
            System.out.println("chuoi nhap sai");
        }
    }
}
