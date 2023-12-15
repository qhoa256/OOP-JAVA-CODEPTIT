package J05017_HOA_DON_TIEN_NUOC;

public class KhachHang {
    private String maKH, hoTen;
    private int chiSoDau, chiSoCuoi;

    public KhachHang(String maKH, String hoTen, int chiSoDau, int chiSoCuoi) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
    }

    public long tongTien(){
        int x = this.chiSoCuoi - this.chiSoDau;
        if(x > 100){
            return Math.round((50 * 100 + 50 * 150 + (x - 100) * 200) * (105.0/100.0));
        }else if(x > 50){
            return Math.round((50 * 100 + (x - 50) * 150) * (103.0/100.0));
        }else{
            return Math.round(x * 100 * (102.0/100.0));
        }
    }

    public String toString(){
        return this.maKH + " " + this.hoTen + " " + tongTien();
    }
}
