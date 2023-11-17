package DANH_SACH_SAN_PHAM;

public class sanPham {
    private String maSP, tenSP;
    private int giaBan, thoiHan;

    public sanPham(String maSP, String tenSP, int giaBan, int thoiHan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHan = thoiHan;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String toString() {
        return this.maSP + " " + this.tenSP + " " + this.giaBan + " " + this.thoiHan;
    }
}
