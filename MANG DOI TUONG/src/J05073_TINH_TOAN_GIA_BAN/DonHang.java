package J05073_TINH_TOAN_GIA_BAN;

public class DonHang {
    private String maDH;
    private long giaBan, soLuong;
    private double tien, thue, vanChuyen, tongTien;

    public DonHang(String maDH, long giaBan, long soLuong) {
        this.maDH = maDH;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        tinhToan();
    }

    public void tinhToan(){
        this.tien = this.giaBan * this.soLuong;
        this.thue = 0.0;
        if(this.maDH.startsWith("T")){
            this.thue += this.tien * 29.0/100.0;
            this.vanChuyen = this.tien * 4.0/100.0;
        }else if(this.maDH.startsWith("C")){
            this.thue += this.tien * 10.0/100.0;
            this.vanChuyen = this.tien * 3.0/100.0;
        }else if(this.maDH.startsWith("D")){
            this.thue += this.tien * 8.0/100.0;
            this.vanChuyen = this.tien * 2.5 / 100.0;
        }else{
            this.thue += this.tien * 2.0/100.0;
            this.vanChuyen = this.tien * 0.5/100.0;
        }
        if(this.maDH.endsWith("C")){
            this.thue -= 5.0/100.0 * this.thue;
        }
        this.tongTien = (this.thue + this.tien + this.vanChuyen) * 120.0/100.0;
        this.tongTien /= this.soLuong * 1.0;
    }
    public String toString(){
        return this.maDH + " " + String.format("%.2f", this.tongTien);
    }
}
