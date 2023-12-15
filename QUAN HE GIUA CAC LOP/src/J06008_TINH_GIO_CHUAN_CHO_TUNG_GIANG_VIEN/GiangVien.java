package J06008_TINH_GIO_CHUAN_CHO_TUNG_GIANG_VIEN;

import java.util.ArrayList;

public class GiangVien {
    private String maGV, tenGV;

    ArrayList<String> dsMon = new ArrayList<>();
    private double tongGio;

    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public double getTongGio() {
        return tongGio;
    }

    public void setTongGio(double tongGio) {
        this.tongGio = tongGio;
    }

    public String toString(){
        return this.tenGV + " " + String.format("%.2f", this.tongGio);
    }

    public String getMaGV() {
        return maGV;
    }
}
