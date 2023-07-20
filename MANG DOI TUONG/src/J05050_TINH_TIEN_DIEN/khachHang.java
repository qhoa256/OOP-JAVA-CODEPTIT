package J05050_TINH_TIEN_DIEN;

public class khachHang {
    private String maKH, loaiSD;
    private double soCu, soMoi;

    public khachHang() {
    }

    public khachHang(String maKH, String loaiSD, double soCu, double soMoi) {
        this.maKH = maKH;
        this.loaiSD = loaiSD;
        this.soCu = soCu;
        this.soMoi = soMoi;
    }

    public double heSo() {
        if (this.loaiSD.contentEquals("KD"))
            return 3;
        else if (this.loaiSD.contentEquals("NN"))
            return 5;
        else if (this.loaiSD.contentEquals("TT"))
            return 4;
        else return 2;
    }

    public double thanhTien() {
        return (this.soMoi - this.soCu) * heSo() * 550;
    }

    public double phuTroi() {
        double x = this.soMoi - this.soCu;
        if (x > 100)
            return thanhTien() * 100.0 / 100.0;
        else if (x >= 50)
            return thanhTien() * 35.0 / 100.0;
        else return 0;
    }

    public double tongTien() {
        return phuTroi() + thanhTien();
    }

    public String toString() {
        return this.maKH + " " + String.format("%.0f", heSo()) + " " + String.format("%.0f", thanhTien()) + " " + String.format("%.0f", phuTroi()) + " " + String.format("%.0f", tongTien());
    }
}
