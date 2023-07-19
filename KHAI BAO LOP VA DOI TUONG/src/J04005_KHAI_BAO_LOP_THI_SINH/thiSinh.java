package J04005_KHAI_BAO_LOP_THI_SINH;

public class thiSinh {
    private String hoTen, ngaySinh;
    private double mon1, mon2, mon3;

    public thiSinh(String hoTen, String ngaySinh, double mon1, double mon2, double mon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    double sum() {
        return this.mon1 + this.mon2 + this.mon3;
    }

    @Override
    public String toString() {
        return this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f",sum());
    }
}
