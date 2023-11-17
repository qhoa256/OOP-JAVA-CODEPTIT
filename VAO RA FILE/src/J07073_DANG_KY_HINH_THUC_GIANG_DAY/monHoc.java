package J07073_DANG_KY_HINH_THUC_GIANG_DAY;

public class monHoc {
    private String maMon, tenMon, lyThuyet, thucHanh;
    private int tinChi;

    public monHoc(String maMon, String tenMon, int tinChi, String lyThuyet, String thucHanh) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getThucHanh() {
        return thucHanh;
    }

    public String toString() {
        return this.maMon + " " + this.tenMon + " " + this.tinChi + " " + this.lyThuyet + " " + this.thucHanh;
    }
}
