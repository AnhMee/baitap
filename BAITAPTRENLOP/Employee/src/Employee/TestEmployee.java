package Employee;

public class TestEmployee {
}
public class Main {
    public static void main(String[] args) {
        // Bộ định dạng hiển thị số có dấu phẩy ngăn cách hàng nghìn
        DecimalFormat df = new DecimalFormat("#,###");

        // Tạo danh sách nhân viên
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("Nguyễn Văn A", 10000000, 2000000);
        employees[1] = new PartTimeEmployee("Trần Thị B", 80, 50000);
        employees[2] = new FullTimeEmployee("Lê Văn C", 12000000, 2500000);

        // Duyệt và in kết quả
        for (Employee emp : employees) {
            System.out.println("Nhân viên: " + emp.getName() +
                    " | Lương: " + df.format(emp.calculateSalary()) + " VND");
        }
    }
}