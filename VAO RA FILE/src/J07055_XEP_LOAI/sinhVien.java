package J07055_XEP_LOAI;

public class sinhVien {
    private String maSV, hoTen, xepLoai;
    private double luyenTap, thucHanh, thi;

    public sinhVien(String maSV, String hoTen, double luyenTap, double thucHanh, double thi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.luyenTap = luyenTap;
        this.thucHanh = thucHanh;
        this.thi = thi;
    }

    public double diemTB() {
        return (this.luyenTap * 0.25 + this.thucHanh * 0.35 + this.thi * 0.4);
    }

    public void chuanHoa() {
        String[] x = hoTen.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < x.length; i++) {
            res += Character.toUpperCase(x[i].charAt(0));
            for (int j = 1; j < x[i].length(); j++) {
                res += Character.toLowerCase(x[i].charAt(j));
            }
            if (i != x.length - 1) res += " ";
        }
        hoTen = res;
    }

    public void loai() {
        double res = diemTB();
        if (res >= 8.0) xepLoai = "GIOI";
        else if (res >= 6.5) xepLoai = "KHA";
        else if (res >= 5.0) xepLoai = "TRUNG BINH";
        else xepLoai = "KEM";
        return;
    }

    public String toString() {
        chuanHoa();
        loai();
        return this.maSV + " " + this.hoTen + " " + String.format("%.2f", diemTB()) + " " + this.xepLoai;
    }
}
