package J05072_TINH_CUOC_DIEN_THOAI_CO_DINH_2;

public class DienThoai {
    private String sdt, tinh;
    private long soPhut, soTien;

    public DienThoai(String sdt, String tinh, long soPhut, long soTien) {
        this.sdt = sdt;
        this.tinh = tinh;
        this.soPhut = soPhut;
        this.soTien = soTien;
    }

    public long getSoTien() {
        return soTien;
    }

    public String toString(){
        return this.sdt + " " + this.tinh + " " + this.soPhut + " " + this.soTien;
    }
}
