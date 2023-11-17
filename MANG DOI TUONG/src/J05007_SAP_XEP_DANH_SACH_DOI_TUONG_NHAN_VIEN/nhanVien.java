package J05007_SAP_XEP_DANH_SACH_DOI_TUONG_NHAN_VIEN;

public class nhanVien {
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, hopDong;

    public nhanVien(String maNV, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String hopDong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.hopDong = hopDong;
    }

    public String getTuoi() {
        String[] x = this.ngaySinh.split("/");
        StringBuilder sb = new StringBuilder("");
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }

    public String toString() {
        return this.maNV + " " + this.hoTen + " " + this.gioiTinh + " " + this.ngaySinh + " " + this.diaChi + " " + this.maSoThue + " " + this.hopDong;
    }
}
