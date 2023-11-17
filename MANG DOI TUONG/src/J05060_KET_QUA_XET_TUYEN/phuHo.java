package J05060_KET_QUA_XET_TUYEN;

public class phuHo {
    private String maPH, hoTen, ngaySinh;
    private double lyThuyet, thucHanh;

    public phuHo(String maPH, String hoTen, String ngaySinh, double lyThuyet, double thucHanh) {
        this.maPH = maPH;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public double diemTB() {
        double diem = (this.lyThuyet + this.thucHanh) / 2.0;
        double res = 0.0;
        if (this.lyThuyet >= 8.0 && this.thucHanh >= 8.0) {
            res = Math.round(diem + 1.0);
        } else if (this.lyThuyet >= 7.5 && this.thucHanh >= 7.5) {
            res = Math.round(diem + 0.5);
        } else {
            res = Math.round(diem);
        }
        return Math.round(Math.min(res, 10.0));
    }

    public int tuoi() {
        String[] x = this.ngaySinh.split("/");
        return 2021 - Integer.parseInt(x[2]);
    }

    public String xepLoai() {
        double d = diemTB();
        if (d >= 9.0) {
            return "Xuat sac";
        } else if (d >= 8.0) {
            return "Gioi";
        } else if (d >= 7.0) {
            return "Kha";
        } else if (d >= 5.0) {
            return "Trung binh";
        } else {
            return "Truot";
        }
    }

    public String toString() {
        return this.maPH + " " + this.hoTen + " " + tuoi() + " " + String.format("%.0f", diemTB()) + " " + xepLoai();
    }
}
