import java.util.Scanner;
    public class bai13{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Nhập số tự nhiên N: ");
            int N = sc.nextInt();

            int tong = 0;
            int temp = N;

            while(temp > 0){
                int chuSo =  temp % 10;
                tong += chuSo;
                temp /= 10;
            }
            System.out.println("Tổng các chữ số của "+ N +" là: "+ tong);
            sc.close();
        }
    }