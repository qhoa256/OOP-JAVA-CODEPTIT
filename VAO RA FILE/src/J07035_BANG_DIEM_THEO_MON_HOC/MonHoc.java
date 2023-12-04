package J07035_BANG_DIEM_THEO_MON_HOC;

public class monHoc {
    private String maMon, tenMon;
    private int soTinChi;

    public monHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }
}
