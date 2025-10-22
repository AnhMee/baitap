public class bai3 {

    public int SoNguyen (int n ){
        if(n >= 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        bai3 b3 = new bai3();
        System.out.println(b3.SoNguyen(0));

    }
}
