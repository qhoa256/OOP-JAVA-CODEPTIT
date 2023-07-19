package J05037_TINH_GIA_BAN_2;

public class matHang {
    private String maMH, tenMH, donVi;
    private int giaNhap, soLuong;

    public matHang() {
    }

    public matHang(String maMH, String tenMH, String donVi, int giaNhap, int soLuong) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
    }

    public int phiVanChuyen() {
        return (int) Math.round((this.giaNhap * this.soLuong) * 0.05);
    }

    public int thanhTien() {
        return this.giaNhap * soLuong + phiVanChuyen();
    }

    public int giaBan() {
        return (int) Math.ceil((1.02 * thanhTien() / this.soLuong) / 100) * 100;
    }

    public String toString() {
        return this.maMH + " " + this.tenMH + " " + this.donVi + " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
    }
}
