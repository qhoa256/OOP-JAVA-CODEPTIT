package J07027_QUAN_LY_BAI_TAP_NHOM;

public class sinhVien {
    private String maSV, hoTen, sdt;

    public sinhVien(String maSV, String hoTen, String sdt) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
    }

    public String getMaSV() {
        return maSV;
    }

    public String toString(){
        return this.maSV+" "+this.hoTen+" "+this.sdt;
    }
}
