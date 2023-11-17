package BAI_TOAN_BAN_HANG;

public class khachHang {
    private String maKH, hoTen, gioiTinh, ngaySinh, diaChi;

    public khachHang(String maKH, String hoTen, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
