package J05014_TUYEN_GIAO_VIEN;

public class GiaoVien {
    private String maGV, hoTen, maXT;
    private double tinHoc, chuyenMon;

    public GiaoVien(String maGV, String hoTen, String maXT, double tinHoc, double chuyenMon) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.maXT = maXT;
        this.tinHoc = tinHoc;
        this.chuyenMon = chuyenMon;
    }

    public String getMon(){
        String x = this.maXT.substring(0, 1);
        if(x.equals("A")) return "TOAN";
        else if(x.equals("B")) return "LY";
        else return "HOA";
    }

    public double uuTien(){
        String x = this.maXT.substring(1);
        if(x.equals("1")) return 2.0;
        else if(x.equals("2")) return 1.5;
        else if(x.equals("3")) return 1.0;
        else return 0.0;
    }

    public String getMaGV() {
        return maGV;
    }

    public double tongDiem(){
        return this.chuyenMon + this.tinHoc * 2 + uuTien();
    }

    public String ketQua(){
        double x = tongDiem();
        if(x >= 18.0) return "TRUNG TUYEN";
        else return "LOAI";
    }

    public String toString(){
        return this.maGV + " " + this.hoTen + " " + getMon() + " " + String.format("%.1f", tongDiem()) + " " + ketQua();
    }
}
