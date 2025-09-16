import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a){
            // tinh chu vi
            double chuvi = a + b + c;

            // nua chu vi
            double nuachuvi = chuvi / 2;

            // dien tich
            double dientich = Math.sqrt(nuachuvi * (nuachuvi - a) * (nuachuvi - b) * (nuachuvi - c));

            System.out.println(chuvi);
            System.out.println(dientich);
        }else {
            System.out.println("khong tao thanh tam giac");
        }
    }
}
