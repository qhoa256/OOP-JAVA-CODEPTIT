package J06007_BANG_TINH_GIO_CHUAN;

import java.util.ArrayList;

public class GiangVien {
    private String maGV, tenGV;
    ArrayList<MonHoc> x = new ArrayList<>();
    private double gioChuan;

    public GiangVien(String maGV, String tenGV, ArrayList<MonHoc> x) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.x = x;
    }

    public double getGioChuan() {
        return gioChuan;
    }

    public void setGioChuan(double gioChuan) {
        this.gioChuan = gioChuan;
    }
    public String toString(){
        return this.tenGV + " " + String.format("%.2f", this.gioChuan);
    }

    public String getMaGV() {
        return maGV;
    }
}
