package J05038_BANG_KE_TIEN_LUONG;

public class nhanVien {
    private String maNV, hoTen, chucVu;
    private int luong, soNgay;

    public nhanVien() {
    }

    public nhanVien(String maNV, String hoTen, int luong, int soNgay, String chucVu) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
        this.soNgay = soNgay;
        this.chucVu = chucVu;
    }

    public int luongThang() {
        return this.luong * soNgay;
    }

    public int thuong() {
        if (this.soNgay >= 25) {
            return (int) (luongThang() * 0.2);
        } else if (this.soNgay >= 22) {
            return (int) (luongThang() * 0.1);
        } else {
            return 0;
        }
    }

    public int phuCap() {
        if (this.chucVu.compareTo("GD") == 0) {
            return 250000;
        } else if (this.chucVu.compareTo("PGD") == 0) {
            return 200000;
        } else if (this.chucVu.compareTo("TP") == 0) {
            return 180000;
        } else {
            return 150000;
        }
    }

    public int tong() {
        return luongThang() + thuong() + phuCap();
    }

    public String toString() {
        return this.maNV + " " + this.hoTen + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + tong();
    }
}
