package J05019_LUONG_MUA_TRUNG_BINH;

public class TramDo {
    private String maTram, tenTram;
    private long luongMua;
    private double thoiGian;

    public TramDo(String maTram, String tenTram) {
        this.maTram = maTram;
        this.tenTram = tenTram;
        this.luongMua = 0;
        this.thoiGian = 0.0;
    }

    public String getTenTram() {
        return tenTram;
    }

    public long getLuongMua() {
        return luongMua;
    }

    public void setLuongMua(long luongMua) {
        this.luongMua = luongMua;
    }

    public double getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(double thoiGian) {
        this.thoiGian = thoiGian;
    }

    public double luongMuaTB(){
        return this.luongMua / this.thoiGian * 1.0;
    }

    public String toString(){
        return this.maTram + " " + this.tenTram + " " + String.format("%.2f", luongMuaTB());
    }
}
