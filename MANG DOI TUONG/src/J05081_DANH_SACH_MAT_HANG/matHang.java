package J05081_DANH_SACH_MAT_HANG;

public class matHang {
    private String maMH, tenMH, donVi;
    private int giaMua, giaBan;

    public matHang() {
    }

    public matHang(String maMH, String tenMH, String donVi, int giaMua, int giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int profit() {
        return this.giaBan - this.giaMua;
    }

    public String getMaMH() {
        return this.maMH;
    }

    public String toString() {
        return this.maMH + " " + this.tenMH + " " + this.donVi + " " + this.giaMua + " " + this.giaBan + " " + profit();
    }
}
