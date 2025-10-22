package QuickNote;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý
        QuanLyGhiChu ql = new QuanLyGhiChu();

        // Tạo một số ghi chú
        GhiChu gc1 = new GhiChuDaQua("GC01", "Họp nhóm", "Thảo luận đồ án", "01/09/2025", "Phòng A1");
        GhiChu gc2 = new GhiChuSapToi("GC02", "Sinh nhật", "Tổ chức sinh nhật bạn A", "10/10/2025", "Nhà hàng B");

        // Thêm vào danh sách
        ql.themGhiChu(gc1);
        ql.themGhiChu(gc2);

        // Hiển thị tất cả ghi chú
        ql.hienThiTatCa();
    }
}
