package J05021_SAP_XEP_THEO_MA_SINH_VIEN;

public class sinhVien {
    private String maSV, hoTen, lop, email;

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email;
    }
}
