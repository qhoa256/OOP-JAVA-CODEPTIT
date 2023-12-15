package J05012_TINH_TIEN;

public class DonHang {
    private String maDH, tenDH;
    private long soLuong, donGia, chietKhau;

    public DonHang(String maDH, String tenDH, long soLuong, long donGia, long chietKhau) {
        this.maDH = maDH;
        this.tenDH = tenDH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public long tien(){
        return this.donGia * this.soLuong;
    }

    public long tongTien(){
        return tien() - this.chietKhau;
    }

    public String toString(){
        return this.maDH + " " + this.tenDH + " " + this.soLuong + " " + this.donGia + " " + this.chietKhau + " " + tongTien();
    }
}
