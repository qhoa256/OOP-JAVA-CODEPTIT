package DANH_SACH_CA_THI;

public class monThi {
    private String maMon, tenMon, hinhThuc, maCaThi, phongThi, ngayThi, thoiGian, tenNhom;
    private int soLuong;

    public monThi(String maMon, String tenMon, String hinhThuc) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    public void setMaCaThi(String maCaThi) {
        this.maCaThi = maCaThi;
    }

    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setPhongThi(String phongThi) {
        this.phongThi = phongThi;
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getNgay() {
        String[] x = this.ngayThi.split("/");
        StringBuilder res = new StringBuilder("");
        res.append(x[2]);
        res.append(x[1]);
        res.append(x[0]);
        return res.toString();
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public String toString() {
        return this.ngayThi + " " + this.thoiGian + " " + this.phongThi + " " + this.tenMon + " " + this.tenNhom + " " + this.soLuong;
    }
}
