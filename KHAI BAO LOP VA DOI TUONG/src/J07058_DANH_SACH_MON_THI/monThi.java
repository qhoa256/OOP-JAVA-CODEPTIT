package J07058_DANH_SACH_MON_THI;

public class monThi {
    private String maMon, tenMon, hinhThuc;

    public monThi(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public String getMaMon() {
        return maMon;
    }

    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.hinhThuc;
    }
}
