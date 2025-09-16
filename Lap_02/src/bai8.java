import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        float a =sc.nextFloat();
        a = (int) a;

        if(a > 0){
            System.out.println(a + "yes");
        }else{
            System.out.println(a + "no");
        }
    }
}
