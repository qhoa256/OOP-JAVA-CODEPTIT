package J05031_BANG_DIEM_THANH_PHAN_2;

public class bangDiem {
    private String maSV, tenSV, lop;
    private double diem1, diem2, diem3;

    public bangDiem() {
    }

    public bangDiem(String maSV, String tenSV, String lop, double diem1, double diem2, double diem3) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String toString() {
        return this.maSV + " " + this.tenSV + " " + this.lop + " " + String.format("%.1f", this.diem1) + " " + String.format("%.1f", this.diem2) + " " + String.format("%.1f", this.diem3);
    }
}
