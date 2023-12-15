package J06006_QUAN_LY_BAN_HANG_2;

import java.util.ArrayList;

public class HoaDon {
    private String maHD, maKH, maMH, tenKH, diaChi, tenMH;
    private long soLuong, thanhTien, loiNhuan;

    ArrayList<KhachHang> x = new ArrayList<>();
    ArrayList<MatHang> y = new ArrayList<>();

    public HoaDon(String maHD, String maKH, String maMH, long soLuong, ArrayList<KhachHang> x, ArrayList<MatHang> y) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
        this.x = x;
        this.y = y;
        Khach();
        Hang();
    }


    public void Khach(){
        for(KhachHang h:x){
            if(h.getMaKH().equals(this.maKH)){
                this.tenKH = h.getTenKH();
                this.diaChi = h.getDiaChi();
                return;
            }
        }
    }

    public String getMaHD() {
        return maHD;
    }

    public void Hang(){
        for(MatHang q:y){
            if(q.getMaMH().equals(this.maMH)){
                this.tenMH = q.getTenMH();
                this.thanhTien = q.getGiaBan() * this.soLuong;
                this.loiNhuan = this.soLuong * (q.getGiaBan() - q.getGiaMua());
                return;
            }
        }
    }

    public long getLoiNhuan() {
        return loiNhuan;
    }

    public String toString(){
        return this.maHD + " " + this.tenKH + " " + this.diaChi + " " + this.tenMH + " " + this.soLuong + " " + this.thanhTien + " " + this.loiNhuan;
    }
}

//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4