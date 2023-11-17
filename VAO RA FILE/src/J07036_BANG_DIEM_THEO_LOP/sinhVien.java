package J07036_BANG_DIEM_THEO_LOP;

public class sinhVien {
    private String maSV, hoTen, maMon, tenMon, lop;
    private double diem;

    public sinhVien(String maSV, String hoTen, String maMon, String tenMon, String lop, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.lop = lop;
        this.diem = diem;
    }

    public String chuanHoa() {
        String[] x = hoTen.split("\\s+");
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
        return sb.toString();
    }

    public String getLop() {
        return lop;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String toString(){
        this.hoTen = chuanHoa();
        double tmp = this.diem;
        if(this.diem == (int)tmp){
            return this.maSV + " " + this.hoTen + " " + this.maMon + " " + this.tenMon + " " + String.format("%.0f", this.diem);
        }
        return this.maSV + " " + this.hoTen + " " + this.maMon + " " + this.tenMon + " " + String.format("%.1f", this.diem);
    }
}
