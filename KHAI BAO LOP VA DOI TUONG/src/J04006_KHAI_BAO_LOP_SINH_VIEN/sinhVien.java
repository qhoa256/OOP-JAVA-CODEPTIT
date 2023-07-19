package J04006_KHAI_BAO_LOP_SINH_VIEN;

public class sinhVien {
    private String msv = "B20DCCN001", hoTen, lop, ngaySinh;
    private double gpa;

    public sinhVien() {
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0;
    }

    public sinhVien(String hoTen, String lop, String ngaySinh, double gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    void chuanHoa() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        chuanHoa();
        return this.msv + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + String.format("%.2f", this.gpa);
    }
}
