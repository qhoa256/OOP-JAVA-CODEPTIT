package J05066_TIM_KIEM_NHAN_VIEN;

public class NhanVien {
    private String maNV, hoTen;

    public NhanVien(String maNV, String hoTen) {
        this.maNV = maNV;
        this.hoTen = hoTen;
    }

    public String maCV(){
        return this.maNV.substring(0, 2);
    }
    public String soHieu(){
        return this.maNV.substring(4);
    }

    public String bacLuong(){
        return this.maNV.substring(2, 4);
    }

    public String getHoTen() {
        return hoTen;
    }

    public String toString(){
        return this.hoTen + " " + maCV() + " " + soHieu() + " " + bacLuong();
    }
}
