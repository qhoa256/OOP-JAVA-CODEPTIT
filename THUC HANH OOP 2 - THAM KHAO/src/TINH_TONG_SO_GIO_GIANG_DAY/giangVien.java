package TINH_TONG_SO_GIO_GIANG_DAY;

public class giangVien {
    private String maGV, tenGV;
    private double gioDay;

    public giangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public double getGioDay() {
        return gioDay;
    }

    public void setGioDay(double gioDay) {
        this.gioDay = gioDay;
    }

    public String getTenGV() {
        return tenGV;
    }
}
