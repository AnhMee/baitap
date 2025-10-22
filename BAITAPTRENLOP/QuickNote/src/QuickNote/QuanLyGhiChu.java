package QuickNote;

import java.util.ArrayList;

public class QuanLyGhiChu {
    private ArrayList<GhiChu> danhSach = new ArrayList<>();

    // Thêm ghi chú
    public void themGhiChu(GhiChu gc) {
        danhSach.add(gc);
    }

    // Hiển thị tất cả ghi chú
    public void hienThiTatCa() {
        for (GhiChu gc : danhSach) {
            gc.hienThiThongTin();
            System.out.println("------------------");
        }
    }
}
