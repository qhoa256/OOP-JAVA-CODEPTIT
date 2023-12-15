package J05082_DANH_SACH_KHACH_HANG;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class khachHang {
    private String maKH, hoTen, gioiTinh, ngaySinh, diaChi;

    public khachHang(String maKH, String hoTen, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        chuanHoaNgaySinh();
        chuanHoaHoTen();
        this.diaChi = diaChi;
    }

    public void chuanHoaNgaySinh() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, '0');
        }
        this.ngaySinh = sb.toString();
    }

    public void chuanHoaHoTen() {
        StringBuilder res = new StringBuilder("");
        String[] x = this.hoTen.split("\\s+");
        for (int i = 0; i < x.length; i++) {
            res.append(Character.toUpperCase(x[i].charAt(0)));
            for (int j = 1; j < x[i].length(); j++) {
                res.append(Character.toLowerCase(x[i].charAt(j)));
            }
            if (i != x.length - 1) {
                res.append(" ");
            }
        }
        this.hoTen = res.toString();
    }

    public String tuoi() {
        String[] x = this.ngaySinh.split("/");
        StringBuilder res = new StringBuilder("");
        res.append(x[2]);
        res.append(x[1]);
        res.append(x[0]);
        return res.toString();
    }

    public String toString() {
        return this.maKH + " " + this.hoTen + " " + this.gioiTinh + " " + this.diaChi + " " + this.ngaySinh;
    }
}


