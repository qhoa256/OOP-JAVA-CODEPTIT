package J05076_NHAP_XUAT_HANG;

import java.util.ArrayList;

public class DonHang {
    private String maHang, tenHang;
    private long soLuongNhap, donGiaNhap, soLuongXuat, giaNhap, giaXuat;

    public DonHang(String maHang, long soLuongNhap, long donGiaNhap, long soLuongXuat, ArrayList<MatHang> mh) {
        this.maHang = maHang;
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
        this.giaNhap = this.donGiaNhap * this.soLuongNhap;
        for(MatHang x:mh){
            if(x.getMaHang().equals(this.maHang)){
                this.tenHang = x.getTenHang();
                this.giaXuat = (long) (this.soLuongXuat * this.donGiaNhap * (1 + x.laiSuat()));
                break;
            }
        }
    }

    public String toString(){
        return this.maHang + " " + this.tenHang + " " + this.giaNhap + " " + this.giaXuat;
    }
}
