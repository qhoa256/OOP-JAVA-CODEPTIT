package J07018_CHUAN_HOA_DANH_SACH_SINH_VIEN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String maSV, hoTen, lop;
    private Date ngaySinh;
    private double gpa;

    public SinhVien(String maSV, String hoTen, String lop, String ngaySinh, double gpa) throws ParseException {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
        chuanHoa();
    }

    public void chuanHoa() {
        String[] x = this.hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < x.length; i++) {
            sb.append(Character.toUpperCase(x[i].charAt(0)));
            for (int j = 1; j < x[i].length(); j++) {
                sb.append(Character.toLowerCase(x[i].charAt(j)));
            }
            if (i != x.length - 1) {
                sb.append(" ");
            }
        }
        this.hoTen = sb.toString();
    }

    public String toString() {
        String ngaySinh = new SimpleDateFormat("dd/MM/yyyy").format(this.ngaySinh);
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
