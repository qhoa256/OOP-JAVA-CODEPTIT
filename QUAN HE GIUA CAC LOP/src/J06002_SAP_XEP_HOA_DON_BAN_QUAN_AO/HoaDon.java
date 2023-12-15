package J06002_SAP_XEP_HOA_DON_BAN_QUAN_AO;

public class HoaDon {
    private String maSP, tenSP;
    private long giamGia, tongTien;

    public HoaDon(String maSP, String tenSP, long giamGia, long tongTien) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giamGia = giamGia;
        this.tongTien = tongTien;
    }

    public long getTongTien() {
        return tongTien;
    }

    public String toString(){
        return this.maSP + " " + this.tenSP + " " + this.giamGia + " " + this.tongTien;
    }
}
