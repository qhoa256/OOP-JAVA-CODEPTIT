package J05018_BANG_DIEM_HOC_SINH;

public class bangDiem {
    private String id, tenHS;
    private double Toan, tiengViet, ngoaiNgu, vatLy, hoaHoc, sinhHoc, lichSu, Dia, GDCD, congNghe;

    public bangDiem() {
    }

    public bangDiem(String id, String tenHS, double toan, double tiengViet, double ngoaiNgu, double vatLy, double hoaHoc, double sinhHoc, double lichSu, double dia, double GDCD, double congNghe) {
        this.id = id;
        this.tenHS = tenHS;
        Toan = toan;
        this.tiengViet = tiengViet;
        this.ngoaiNgu = ngoaiNgu;
        this.vatLy = vatLy;
        this.hoaHoc = hoaHoc;
        this.sinhHoc = sinhHoc;
        this.lichSu = lichSu;
        Dia = dia;
        this.GDCD = GDCD;
        this.congNghe = congNghe;
    }

    public String getId() {
        return id;
    }

    public double diemTB() {
        return (this.Toan * 2 + this.tiengViet * 2 + this.ngoaiNgu + this.vatLy + this.hoaHoc + this.sinhHoc + this.lichSu + this.Dia + this.GDCD + this.congNghe) / 12.0;
    }

    public String toString() {
        String res;
        double tb = (double) Math.round(diemTB() * 10) / 10;
        if (tb >= 9.0) {
            res = "XUAT SAC";
        } else if (tb >= 8.0) {
            res = "GIOI";
        } else if (tb >= 7.0) {
            res = "KHA";
        } else if (tb >= 5.0) {
            res = "TB";
        } else res = "YEU";
        return this.id + " " + this.tenHS + " " + String.format("%.1f", tb) + " " + res;
    }
}
