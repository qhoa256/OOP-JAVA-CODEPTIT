package J05059_XAC_DINH_DANH_SACH_TRUNG_TUYEN;

public class ThiSinh {
    private String maTS, hoTen;
    private double diemToan, diemLy, diemHoa;

    public ThiSinh(String maTS, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        chuanHoa();
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void chuanHoa() {
        String[] x = hoTen.trim().split("\\s+");
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < x.length; i++) {
            res.append(Character.toUpperCase(x[i].charAt(0)));
            for (int j = 1; j < x[i].length(); j++) {
                res.append(Character.toLowerCase(x[i].charAt(j)));
            }
            if (i != x.length - 1) {
                res.append(" ");
            }
        }
        hoTen = res.toString();
    }

    public double uuTien() {
        String res = maTS.substring(0, 3);
        if (res.equals("KV1")) return 0.5;
        else if (res.equals("KV2")) return 1.0;
        else return 2.5;
    }

    public String getMaTS() {
        return maTS;
    }

    public double xetTuyen() {
        return this.diemToan * 2 + this.diemHoa + this.diemLy + uuTien();
    }

    public String toString() {
        String tmp = "";
        if (uuTien() != 1.0) {
            tmp += uuTien();
        } else {
            tmp += "1";
        }
        if (xetTuyen() == (int) xetTuyen()) {
            return this.maTS + " " + this.hoTen + " " + tmp + " " + (int) xetTuyen() + " ";
        } else {
            return this.maTS + " " + this.hoTen + " " + tmp + " " + String.format("%.1f", xetTuyen()) + " ";
        }
    }
}
