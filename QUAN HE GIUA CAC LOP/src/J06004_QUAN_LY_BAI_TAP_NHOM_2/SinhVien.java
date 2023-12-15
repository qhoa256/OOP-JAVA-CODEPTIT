package J06004_QUAN_LY_BAI_TAP_NHOM_2;

public class SinhVien {
    private String maSV, hoTen, sdt, stt, baiTapNhom;

    public SinhVien(String maSV, String hoTen, String sdt, String stt) {
        this.maSV = maSV.trim();
        this.hoTen = hoTen.trim();
        this.sdt = sdt;
        this.stt = stt;
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

    public String getMaSV() {
        return maSV;
    }

    public void setBaiTapNhom(String baiTapNhom) {
        this.baiTapNhom = baiTapNhom;
    }

    public String getStt() {
        return stt;
    }

    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.sdt + " " + this.stt + " " + this.baiTapNhom;
    }
}
