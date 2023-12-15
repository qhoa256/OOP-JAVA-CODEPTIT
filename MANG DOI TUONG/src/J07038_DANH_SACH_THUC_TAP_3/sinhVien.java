package J07038_DANH_SACH_THUC_TAP_3;

import java.util.ArrayList;

public class sinhVien {
    private String maSV, hoTen, lop, email;
    public ArrayList<String> thucTap = new ArrayList<>();
    public sinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        chuanHoa();
    }

    public String getMaSV() {
        return maSV;
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
        return this.maSV + " " + this.hoTen + " " + this.lop;
    }
}
