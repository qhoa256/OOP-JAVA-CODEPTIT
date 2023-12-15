package J06005_QUAN_LY_BAN_HANG_1;

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

    public String getDonVi() {
        return donVi;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getGiaBan() {
        return giaBan;
    }
}
