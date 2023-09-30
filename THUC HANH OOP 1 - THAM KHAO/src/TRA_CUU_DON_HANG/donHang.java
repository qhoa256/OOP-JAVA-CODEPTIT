package TRA_CUU_DON_HANG;

public class donHang {
    private String tenHang, maDonHang;
    private long donGia, soLuong;

    public donHang() {
    }

    public donHang(String tenHang, String maDonHang, long donGia, long soLuong) {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public long giamGia() {
        String x = "" + this.maDonHang.charAt(this.maDonHang.length() - 1);
        if (x.compareTo("1") == 0) {
            return this.donGia * this.soLuong * 30 / 100;
        } else {
            return this.donGia * this.soLuong * 50 / 100;
        }
    }

    public String STT() {
        return maDonHang.substring(1, 4);
    }

    public long tien() {
        return this.donGia * this.soLuong - giamGia();
    }

    public String toString() {
        return this.tenHang + " " + this.maDonHang + " " + this.STT() + " " + this.giamGia() + " " + this.tien();
    }
}
