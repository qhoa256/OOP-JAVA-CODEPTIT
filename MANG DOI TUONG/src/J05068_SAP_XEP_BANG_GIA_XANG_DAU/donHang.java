package J05068_SAP_XEP_BANG_GIA_XANG_DAU;

public class donHang {
    private String maDH, hangSX;
    private int donGia, soLuong;

    public donHang(String maDH, int soLuong) {
        this.maDH = maDH;
        this.soLuong = soLuong;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public void tinhDonGia(){
        Character x = this.maDH.charAt(0);
        if(x=='X'){
            this.donGia = 128000;
        }else if(x == 'D'){
            this.donGia = 11200;
        }else{
            this.donGia = 9700;
        }
    }
    public long thue() {
        tinhDonGia();
        char x = this.maDH.charAt(0);
        if (this.maDH.substring(3).equals("TN")) return 0;
        long sum = (long)this.donGia * this.soLuong;
        if (x == 'X') {
            return Math.round(sum * 3.0 / 100.0);
        } else if (x == 'D') {
            return Math.round(sum * 3.5 / 100.0);
        } else {
            return Math.round(sum * 2.0 / 100.0);
        }
    }

    public long thanhTien() {
        return thue() + (long)this.donGia * this.soLuong;
    }

    public String toString() {
        tinhDonGia();
        return this.maDH + " " + this.hangSX + " " + this.donGia + " " + thue() + " " + thanhTien();
    }
}

