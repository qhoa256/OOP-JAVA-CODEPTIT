package J07049_TINH_NGAY_HET_HAN_BAO_HANH;

import java.util.ArrayList;

public class khachHang {
    private String maKH, hoTen, diaChi, maSP, ngayMua, hetHan;
    private int soLuong, tongTien;

    public khachHang(String maKH, String hoTen, String diaChi, String maSP, int soLuong, String ngayMua) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
    }

    public void tinhToan(ArrayList<sanPham> sp) {
        this.tongTien = 0;
        for (sanPham x : sp) {
            if (x.getMaSP().compareTo(this.maSP) == 0) {
                this.tongTien += x.getGiaBan() * this.soLuong;

            }
        }
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setHetHan(String hetHan) {
        this.hetHan = hetHan;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getMaKH() {
        return maKH;
    }

    public String ngay() {
        String day = "" + this.hetHan.charAt(0) + this.hetHan.charAt(1);
        String month = "" + this.hetHan.charAt(3) + this.hetHan.charAt(4);
        String year = "" + this.hetHan.charAt(6) + this.hetHan.charAt(7) + this.hetHan.charAt(8) + this.hetHan.charAt(9);
        return year + month + day;
    }

    public String toString() {
        return this.maKH + " " + this.hoTen + " " + this.diaChi + " " + this.maSP + " " + this.tongTien + " " + this.hetHan;
    }
}
