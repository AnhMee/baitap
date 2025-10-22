public class TestBankAccount {
    public static void main(String[] args) {
        // Tạo tài khoản với số dư ban đầu 1000
        BankAccount acc = new BankAccount("12345", 1000);

        // Gọi các phương thức để kiểm tra
        acc.deposit(500);    // Nạp 500
        acc.withdraw(200);   // Rút

        // In ra số dư cuối cùng
        System.out.println("Số dư cuối cùng: " + acc.getBalance());
    }
}
