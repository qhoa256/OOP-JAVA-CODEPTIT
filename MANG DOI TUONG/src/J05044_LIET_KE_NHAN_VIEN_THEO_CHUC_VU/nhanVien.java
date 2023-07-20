package J05044_LIET_KE_NHAN_VIEN_THEO_CHUC_VU;

public class nhanVien {
    private String maNV, hoTen, chucVu;
    private double luongCB, ngayCong;

    public nhanVien() {
    }

    public nhanVien(String maNV, String hoTen, String chucVu, double luongCB, double ngayCong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public double phuCap() {
        if (this.chucVu.equals("GD")) {
            return 500;
        } else if (this.chucVu.equals("PGD")) {
            return 400;
        } else if (this.chucVu.equals("TP")) {
            return 300;
        } else if (this.chucVu.equals("KT")) {
            return 250;
        } else {
            return 100;
        }
    }

    public double tamUng() {
        if ((phuCap() + this.luongCB * this.ngayCong) * 2 / 3 < 25000) {
            return Math.round(((phuCap() + this.luongCB * this.ngayCong) * 2 / 3) / 1000) * 1000;
        } else {
            return 25000;
        }
    }

    public String toString() {
        return this.maNV + " " + this.hoTen + " " + String.format("%.0f", phuCap()) + " " + String.format("%.0f", (this.luongCB * this.ngayCong)) + " " + String.format("%.0f", tamUng()) + " " + String.format("%.0f", this.luongCB * this.ngayCong + phuCap() - tamUng());
    }
}
