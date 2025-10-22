package QuickNote;

public abstract class GhiChu {
    protected String maGhiChu;
    protected String tieuDe;
    protected String noiDung;
    protected String thoiGian;
    protected String diaDiem;

    public GhiChu(String ma, String td, String nd, String tg, String dd) {
        this.maGhiChu = ma;
        this.tieuDe = td;
        this.noiDung = nd;
        this.thoiGian = tg;
        this.diaDiem = dd;
    }

    // Phương thức trừu tượng
    public abstract void hienThiThongTin();
}
