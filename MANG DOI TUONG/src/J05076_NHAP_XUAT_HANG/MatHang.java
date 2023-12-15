package J05076_NHAP_XUAT_HANG;

public class MatHang {
    private String maHang, tenHang, xepLoai;
    public MatHang(String maHang, String tenHang, String xepLoai) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.xepLoai = xepLoai;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public double laiSuat(){
        String x = this.xepLoai;
        if(x.equals("A")) return 0.08;
        else if(x.equals("B")) return 0.05;
        else return 0.02;
    }
}
