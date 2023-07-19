package J05034_DANH_SACH_THUC_TAP_1;

public class sinhVien {
    private String stt, maSV, hoTen, lop, email, doanhNghiep;

    public sinhVien() {
    }

    public sinhVien(String stt, String maSV, String hoTen, String lop, String email, String doanhNghiep) {
        this.stt = stt;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDoanhNghiep() {
        return doanhNghiep;
    }

    public String toString() {
        return this.stt + " " + this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email + " " + this.doanhNghiep;
    }
}
