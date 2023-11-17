package BAI_TOAN_BAN_HANG;

import java.util.ArrayList;

public class hoaDon {
    private String maHD, maKH, maMH;
    private int soLuong;

    private ArrayList<khachHang> kh;
    private ArrayList<matHang> mh;

    public hoaDon(String maHD, String maKH, String maMH, int soLuong) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maMH = maMH;
        this.soLuong = soLuong;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getMaMH() {
        return maMH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setKh(ArrayList<khachHang> kh) {
        this.kh = kh;
    }

    public void setMh(ArrayList<matHang> mh) {
        this.mh = mh;
    }
}
