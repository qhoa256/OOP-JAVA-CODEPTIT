package J05029_DANH_SACH_DOANH_NGHIEP_NHAN_SINH_VIEN_THUC_TAP_2;

public class doanhNghiep {
    private String maDN, tenDN;
    private int soLuong;

    public doanhNghiep() {
    }

    public doanhNghiep(String maDN, String tenDN, int soLuong) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soLuong = soLuong;
    }

    public String getMaDN() {
        return maDN;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String toString() {
        return this.maDN + " " + this.tenDN + " " + this.soLuong;
    }
}
