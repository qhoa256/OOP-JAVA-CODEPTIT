package J07035_BANG_DIEM_THEO_MON_HOC;

public class SinhVien implements Comparable<SinhVien> {
    private String maSV, tenSV, lop, email;
    private String maMH;
    private double diem;

    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        this.tenSV = chuanHoa(tenSV);
        this.lop = lop;
        this.email = email;
    }

    private String chuanHoa(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)));
            for (int j = 1; j < arr[i].length(); ++j) {
                sb.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public void setMaMH(String s) {
        this.maMH = s;
    }

    public void setDiem(double x) {
        this.diem = x;
    }

    public String getMaMH() {
        return maMH;
    }

    public String toString() {
        if ((int) diem == diem)
            return maSV + " " + tenSV + " " + lop + " " + (int) diem;
        else
            return maSV + " " + tenSV + " " + lop + " " + diem;
    }


    @Override
    public int compareTo(SinhVien o) {
        if (this.maMH.equals(o.maMH)) {
            if (this.diem < o.diem) return 1;
            else if (this.diem > o.diem) return -1;
            else return this.maSV.compareTo(o.maSV);
        } else return this.maMH.compareTo(o.maMH);
    }
}