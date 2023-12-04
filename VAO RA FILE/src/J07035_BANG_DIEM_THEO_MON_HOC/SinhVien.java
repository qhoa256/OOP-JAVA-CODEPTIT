package J07035_BANG_DIEM_THEO_MON_HOC;

public class sinhVien {
    private String maSV, hoTen, lop, email;

    public sinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public void chuanHoa() {
        String s = this.hoTen;
        s = s.trim().toLowerCase();
        String res = "" + Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (s.charAt(i - 1) == ' ') res += " " + Character.toUpperCase(s.charAt(i));
                else res += s.charAt(i);
            }
        }
        this.hoTen = res;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }
}
