package J07034_DANH_SACH_MON_HOC;

public class monHoc {
    private String maMon, tenMon;
    private int tinChi;

    public monHoc(String maMon, String tenMon, int tinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.tinChi;
    }
}
