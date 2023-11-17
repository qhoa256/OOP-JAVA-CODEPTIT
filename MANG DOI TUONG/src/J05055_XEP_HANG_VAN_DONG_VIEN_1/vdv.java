package J05055_XEP_HANG_VAN_DONG_VIEN_1;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class vdv {
    private String maVDV, hoTen, ngaySinh, batDau, ketThuc, thucTe, uuTien, thoiGian;
    private int xepHang;

    public vdv(String maVDV, String hoTen, String ngaySinh, String batDau, String ketThuc) {
        this.maVDV = maVDV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        uuTien();
        tinhTong();
    }

    public int tuoi() {
        String[] x = this.ngaySinh.split("/");
        return 2021 - Integer.parseInt(x[2]);
    }

    public int getXepHang() {
        return xepHang;
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public String getMaVDV() {
        return maVDV;
    }

    public void uuTien() {
        int t = tuoi();
        String res = "";
        if (t >= 32) {
            res = "00:00:03";
        } else if (t >= 25) {
            res = "00:00:02";
        } else if (t >= 18) {
            res = "00:00:01";
        } else {
            res = "00:00:00";
        }
        this.uuTien = res;
    }

    public void tinhTong() {
        LocalTime x = LocalTime.parse(this.batDau, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime y = LocalTime.parse(this.ketThuc, DateTimeFormatter.ofPattern("HH:mm:ss"));
        Duration res = Duration.between(x, y);
        LocalTime resTime = LocalTime.MIDNIGHT.plus(res);
        this.thucTe = resTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String tinhThoiGian() {
        LocalTime x = LocalTime.parse(this.thucTe, DateTimeFormatter.ofPattern("HH:mm:ss"));
        LocalTime y = LocalTime.parse(this.uuTien, DateTimeFormatter.ofPattern("HH:mm:ss"));
        long sum = Duration.between(y, x).getSeconds();
        return String.format("%02d:%02d:%02d", sum / 3600, (sum % 3600) / 60, (sum % 3600) % 60);
    }

    public String toString() {
        return this.maVDV + " " + this.hoTen + " " + this.thucTe + " " + this.uuTien + " " + tinhThoiGian() + " " + this.xepHang;
    }
}
