package J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sinhVien {
    private String maSV, hoTen, lop, ngaySinh;
    private double gpa;

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen, String lop, String ngaySinh, double gpa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public void chuanHoaNS() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(this.ngaySinh);
        this.ngaySinh = dateFormat.format(date);
    }

    public String toString() {
        try {
            chuanHoaNS();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
