package J05075_DIEM_DANH_2;

public class sinhVien {
    private String maSV, hoTen, lop, diemDanh;

    public sinhVien(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public void setDiemDanh(String diemDanh) {
        this.diemDanh = diemDanh;
    }

    public String chuyenCan() {
        int res = 10;
        for (int i = 0; i < this.diemDanh.length(); i++) {
            if (this.diemDanh.charAt(i) == 'v') {
                res -= 2;
            } else if (this.diemDanh.charAt(i) == 'm') {
                res -= 1;
            }
            if (res <= 0) {
                res = 0;
                break;
            }
        }
        if (res == 0) {
            return "0 KDDK";
        } else {
            return "" + res;
        }
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    public String toString() {
        chuyenCan();
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + chuyenCan();
    }
}

