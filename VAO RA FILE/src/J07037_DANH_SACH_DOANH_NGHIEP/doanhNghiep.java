package J07037_DANH_SACH_DOANH_NGHIEP;

public class doanhNghiep {
    private String maDN, tenDN;
    private int soLuong;

    public doanhNghiep(String maDN, String tenDN, int soLuong) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soLuong = soLuong;
    }

    public String getMaDN() {
        return maDN;
    }

    public String toString() {
        return this.maDN + " " + this.tenDN + " " + this.soLuong;
    }
}
