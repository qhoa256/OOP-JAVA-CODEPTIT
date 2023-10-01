package BAO_CAO_THUC_TAP_CO_SO;

public class sinhVien {
    private String maSV, hoTen, sdt, email;

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen, String sdt, String email) {
        this.maSV = maSV.trim();
        this.hoTen = hoTen.trim();
        this.sdt = sdt.trim();
        this.email = email.trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }
}
