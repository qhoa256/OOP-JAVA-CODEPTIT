package J04012_BAI_TOAN_TINH_CONG;

public class nhanVien {
    private String maNV, hoTen, chucVu;
    private int luongCB, ngayCong;

    public nhanVien() {
    }

    public nhanVien(String maNV, String hoTen, int luongCB, int ngayCong, String chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }

    int tienLuong() {
        return this.luongCB * this.ngayCong;
    }

    double tienThuong() {
        if (this.ngayCong >= 25)
            return tienLuong() * 0.2;
        else if (this.ngayCong >= 22)
            return tienLuong() * 0.1;
        else
            return 0;
    }

    int phuCap() {
        String cv = this.chucVu.substring(0, 2);
        if (cv.equals("GD")) return 250000;
        else if (cv.equals("PG")) return 200000;
        else if (cv.equals("TP")) return 180000;
        else return 150000;
    }

    @Override
    public String toString() {
        int thuong = (int) tienThuong();
        return this.maNV + " " + this.hoTen + " " + this.tienLuong() + " " + thuong + " " + this.phuCap() + " " + (this.tienLuong() + thuong + this.phuCap());
    }
}
