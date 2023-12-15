package J05078_BANG_LUONG_THEO_PHONG_BAN;

public class NhanVien {
    private String maNV, hoTen;
    private int luongCB, soNgay;

    public NhanVien(String maNV, String hoTen, int luongCB, int soNgay) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.soNgay = soNgay;
    }

    public int soNam() {
        return Integer.parseInt(this.maNV.substring(1, 3));
    }

    public int heSo() {
        int nam = soNam();
        String x = this.maNV.substring(0, 1);
        if (x.equals("A")) {
            if (nam >= 16) {
                return 20;
            } else if (nam >= 9) {
                return 14;
            } else if (nam >= 4) {
                return 12;
            } else if (nam >= 1) {
                return 10;
            } else {
                return 1;
            }
        } else if (x.equals("B")) {
            if (nam >= 16) {
                return 16;
            } else if (nam >= 9) {
                return 13;
            } else if (nam >= 4) {
                return 11;
            } else if (nam >= 1) {
                return 10;
            } else {
                return 1;
            }
        } else if (x.equals("C")) {
            if (nam >= 16) {
                return 14;
            } else if (nam >= 9) {
                return 12;
            } else if (nam >= 4) {
                return 10;
            } else if (nam >= 1) {
                return 9;
            } else {
                return 1;
            }
        } else {
            if (nam >= 16) {
                return 13;
            } else if (nam >= 9) {
                return 11;
            } else if (nam >= 4) {
                return 9;
            } else if (nam >= 1) {
                return 8;
            } else {
                return 1;
            }
        }
    }

    public String pb(){
        return this.maNV.substring(3);
    }
    public int luong() {
        return this.luongCB * this.soNgay * heSo() * 1000;
    }

    public String toString() {
        return this.maNV + " " + this.hoTen + " " + luong();
    }
}
