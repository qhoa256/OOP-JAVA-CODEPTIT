package HUONG_DAN_DO_AN_TOT_NGHIEP;

public class sinhVien {
    private String maSV, hoTen, lop, email, sdt;

    public sinhVien(String maSV, String hoTen, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSdt() {
        return "0" + sdt;
    }
}
