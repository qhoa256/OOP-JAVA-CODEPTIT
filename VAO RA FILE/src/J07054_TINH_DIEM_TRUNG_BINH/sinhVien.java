package J07054_TINH_DIEM_TRUNG_BINH;

public class sinhVien {
    private String maSV, hoTen;
    private double mon1, mon2, mon3;
    private int xepHang;

    public sinhVien(String maSV, String hoTen, double mon1, double mon2, double mon3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
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

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getMaSV() {
        return maSV;
    }

    public double diemTB() {
        return (this.mon1 * 3 + this.mon2 * 3 + this.mon3 * 2) / 8;
    }

    public String toString() {
        chuanHoa();
        return this.maSV + " " + this.hoTen + " " + String.format("%.2f", diemTB()) + " " + this.xepHang;
    }
}
