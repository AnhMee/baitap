package QuickNote;

public class GhiChuDaQua extends GhiChu {

    public GhiChuDaQua(String ma, String td, String nd, String tg, String dd) {
        super(ma, td, nd, tg, dd);
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("=== Ghi chú đã qua ===");
        System.out.println("Mã: " + maGhiChu);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Nội dung: " + noiDung);
        System.out.println("Thời gian: " + thoiGian);
        System.out.println("Địa điểm: " + diaDiem);
    }
}
