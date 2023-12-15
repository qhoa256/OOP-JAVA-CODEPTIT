package J07046_DANH_SACH_LUU_TRU;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang {
    private String maKH, hoTen, maPhong, ngayDen, ngayDi;

    public KhachHang(String maKH, String hoTen, String maPhong, String ngayDen, String ngayDi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public long soNgay(){
        if(this.ngayDen.equals(this.ngayDi)) return 0;
        LocalDate x = LocalDate.parse(this.ngayDen.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate y = LocalDate.parse(this.ngayDi.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(x, y);
    }

    public String toString(){
        return this.maKH + " " + this.hoTen + " " + this.maPhong + " " + soNgay();
    }
}
