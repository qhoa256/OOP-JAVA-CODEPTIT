package J05016_HOA_DON_KHACH_SAN;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class KhachHang {
    private String maKH, hoTen, phong, ngayNhan, ngayTra;
    private int dichVu;

    public KhachHang(String maKH, String hoTen, String phong, String ngayNhan, String ngayTra, int dichVu) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.phong = phong;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.dichVu = dichVu;
    }

    public long soNgay(){
        LocalDate x = LocalDate.parse(this.ngayNhan.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate y = LocalDate.parse(this.ngayTra.trim(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return ChronoUnit.DAYS.between(x, y) + (long)1;
    }

    public long tongTien(){
        String x = this.phong.substring(0, 1);
        if(x.equals("1")){
            return soNgay() * (long)25 + (long)this.dichVu;
        }else if(x.equals("2")){
            return soNgay() * (long)34 + (long)this.dichVu;
        }else if(x.equals("3")){
            return soNgay() * (long)50 + (long)this.dichVu;
        }else{
            return soNgay() * (long)80 + (long)this.dichVu;
        }
    }

    public String toString(){
        return this.maKH + " " + this.hoTen + " " + this.phong + " " + soNgay() + " " + tongTien();
    }
}
