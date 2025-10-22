package QuickNote;

public class GhiChuSapToi extends GhiChu {

    public GhiChuSapToi(String ma, String td, String nd, String tg, String dd) {
        super(ma, td, nd, tg, dd);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Ghi chú sắp tới ===");
        System.out.println("Mã: " + maGhiChu);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Nội dung: " + noiDung);
        System.out.println("Thời gian: " + thoiGian);
        System.out.println("Địa điểm: " + diaDiem);
    }
}
