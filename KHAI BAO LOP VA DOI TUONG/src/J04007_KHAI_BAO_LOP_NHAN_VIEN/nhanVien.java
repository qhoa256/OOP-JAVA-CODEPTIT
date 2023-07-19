package J04007_KHAI_BAO_LOP_NHAN_VIEN;

public class nhanVien {
    private String mnv, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong;

    public nhanVien(String mnv, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String hopDong) {
        this.mnv = mnv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.hopDong = hopDong;
    }

    @Override
    public String toString() {
        return this.mnv + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.hopDong;
    }
}
