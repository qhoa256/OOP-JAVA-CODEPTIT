package J05047_BANG_KE_NHAP_KHO_SAP_XEP_THEO_CHIET_KHAU;

public class matHang {
    private String maMH, tenMH;
    private int soLuong, donGia;

    public matHang() {
    }

    public matHang(String maMH, String tenMH, int soLuong, int donGia) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double phanTram() {
        if (this.soLuong > 10) return 0.05;
        else if (this.soLuong >= 8) return 0.02;
        else if (this.soLuong >= 5) return 0.01;
        else return 0.00;
    }

    public int chietKhau() {
        return (int) (this.donGia * this.soLuong * phanTram());
    }

    public String toString() {
        return this.maMH + " " + this.tenMH + " " + chietKhau() + " " + (this.donGia * this.soLuong - chietKhau());
    }
}
