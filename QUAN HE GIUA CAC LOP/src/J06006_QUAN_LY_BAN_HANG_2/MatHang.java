package J06006_QUAN_LY_BAN_HANG_2;

public class MatHang {
    private String maMH, tenMH, donVi;
    private long giaMua, giaBan;

    public MatHang(String maMH, String tenMH, String donVi, long giaMua, long giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
}
