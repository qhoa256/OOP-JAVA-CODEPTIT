package J05054_XEP_HANG_HOC_SINH;

public class hocSinh {
    private String maHS, hoTen;
    private double diemTB, xepHang;

    public hocSinh() {
    }

    public hocSinh(String maHS, String hoTen, double diemTB) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public String getMaHS() {
        return maHS;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setXepHang(double xepHang) {
        this.xepHang = xepHang;
    }

    public double getXepHang() {
        return xepHang;
    }

    public String xepLoai() {
        if (this.diemTB >= 9)
            return "Gioi";
        else if (this.diemTB >= 7)
            return "Kha";
        else if (this.diemTB >= 5)
            return "Trung Binh";
        else return "Yeu";
    }

    public String toString() {
        return this.maHS + " " + this.hoTen + " " + String.format("%.1f", this.diemTB) + " " + xepLoai() + " " + String.format("%.0f", this.xepHang);
    }
}
