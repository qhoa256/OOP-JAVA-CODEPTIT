package J05053_SAP_XEP_DON_HANG;

public class donHang {
    private String tenHang, maHang;
    private double donGia, soLuong;

    public donHang() {
    }

    public donHang(String tenHang, String maHang, double donGia, double soLuong) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double giamGia() {
        String res = this.maHang.substring(this.maHang.length() - 1);
        if (res.contentEquals("1")) {
            return 50.0 / 100.0 * this.donGia * this.soLuong;
        } else {
            return 30.0 / 100.0 * this.donGia * this.soLuong;
        }
    }

    public String stt() {
        return this.maHang.substring(1, 4);
    }

    public double thanhTien() {
        return this.donGia * this.soLuong - giamGia();
    }

    public String toString() {
        return this.tenHang + " " + this.maHang + " " + stt() + " " + String.format("%.0f", giamGia()) + " " + String.format("%.0f", thanhTien());
    }
}
