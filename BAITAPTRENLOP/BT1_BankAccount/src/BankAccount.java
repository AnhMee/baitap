public class BankAccount {
    // Thuộc tính private
    private String accountNumber;
    private double balance;

    // Hàm khởi tạo đầy đủ tham số
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0; // không cho phép số dư âm
            System.out.println("Số dư khởi tạo không hợp lệ, đặt về 0.");
        }
    }

    // Getter cho accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter cho accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter cho balance
    public double getBalance() {
        return balance;
    }

    // Setter cho balance (kiểm tra số dư không âm)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Số dư không được âm!");
        }
    }

    // Phương thức nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nạp " + amount + " thành công. Số dư hiện tại: " + balance);
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0!");
        }
    }

    // Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rút " + amount + " thành công. Số dư còn lại: " + balance);
        } else {
            System.out.println("Rút tiền thất bại. Số tiền không hợp lệ hoặc vượt quá số dư!");
        }
    }

}

