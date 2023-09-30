package DANH_SACH_MON_THI_2;

public class monHoc {
    private String maMon, tenMon, hinhThuc;

    public monHoc() {
    }

    public monHoc(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMon() {
        return maMon;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThuc;
    }
}
