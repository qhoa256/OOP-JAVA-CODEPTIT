package J07081_SAP_XEP_DANH_SACH_SINH_VIEN;

public class sinhVien {
    private String maSV, hoTen, sdt, email;

    public sinhVien(String maSV, String hoTen, String sdt, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public String getTen() {
        String[] x = this.hoTen.trim().split("\\s+");
        return x[x.length - 1];
    }

    public String getHo() {
        String[] x = this.hoTen.trim().split("\\s+");
        return x[0];
    }

    public String getTenDem() {
        String[] x = this.hoTen.trim().split("\\s+");
        String res = "";
        for (int i = 1; i < x.length - 1; i++) {
            res += x[i];
            if (i != x.length - 2) {
                res += " ";
            }
        }
        return res;
    }

    public String getMaSV() {
        return maSV;
    }

    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.sdt + " " + this.email;
    }
}
