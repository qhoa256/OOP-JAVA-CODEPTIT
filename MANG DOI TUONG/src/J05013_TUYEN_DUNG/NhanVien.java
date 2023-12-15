package J05013_TUYEN_DUNG;

public class NhanVien {
    private String idNV, hoTen;
    private double lyThuyet, thucHanh;

    public NhanVien(String idNV, String hoTen, Double lyThuyet, Double thucHanh) {
        this.idNV = idNV;
        this.hoTen = hoTen;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public double diemTB() {
        if (this.lyThuyet > 10) {
            this.lyThuyet /= 10.0;
        }
        if (this.thucHanh > 10) {
            this.thucHanh /= 10.0;
        }
        return (this.thucHanh + this.lyThuyet) / 2.0;
    }

    public String ketQua() {
        double x = diemTB();
        if (x >= 9.5) {
            return "XUAT SAC";
        } else if (x >= 8.0) {
            return "DAT";
        } else if (x >= 5.0) {
            return "CAN NHAC";
        } else {
            return "TRUOT";
        }
    }

    public String toString() {
        return this.idNV + " " + this.hoTen + " " + String.format("%.2f", diemTB()) + " " + ketQua();
    }
}
