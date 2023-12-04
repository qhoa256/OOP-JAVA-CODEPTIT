package J05065_LIET_KE_SINH_VIEN_THEO_NHOM;

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
    public String toString(){
        return this.hoTen + " " + maCV() + " " + soHieu() + " " + bacLuong();
    }
}
