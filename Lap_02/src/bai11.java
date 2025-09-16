import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int acii = (int)ch;
        if(acii >= 97 && acii <= 122){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
