package J07047_QUAN_LY_KHACH_SAN;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class khachHang {
    private String maKH, hoTen, maPhong, ngayDen, ngayDi;
    private double tongTien;

    public khachHang(String maKH, String hoTen, String maPhong, String ngayDen, String ngayDi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public long soNgay() {
        LocalDate batDau = LocalDate.parse(ngayDen, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate ketThuc = LocalDate.parse(ngayDi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(batDau, ketThuc);
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String ma() {
        return "" + this.maPhong.charAt(2);
    }

    public String toString() {
        return this.maKH + " " + this.hoTen + " " + this.maPhong + " " + this.soNgay() + " " + String.format("%.2f", this.tongTien);
    }
}
