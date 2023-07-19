package J05010_SAP_XEP_DANH_SACH_MAT_HANG;

public class matHang {
    private String maMH, tenMH, nhomMH;
    private double giaMua, giaBan;

    public matHang() {
    }

    public matHang(String maMH, String tenMH, String nhomMH, double giaMua, double giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.nhomMH = nhomMH;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String toString() {
        return this.maMH + " " + this.tenMH + " " + this.nhomMH + " " + String.format("%.2f", loiNhuan());
    }
}
