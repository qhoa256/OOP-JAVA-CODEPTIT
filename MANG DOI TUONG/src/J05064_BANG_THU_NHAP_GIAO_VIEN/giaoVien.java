package J05064_BANG_THU_NHAP_GIAO_VIEN;

public class giaoVien {
    private String maGV, hoTen;
    private int luongCB;

    public giaoVien(String maGV, String hoTen, int luongCB) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }

    public int phuCap() {
        String cv = this.maGV.substring(0, 2);
        if (cv.equals("GV")) return 500000;
        else if (cv.equals("HP")) return 900000;
        else return 2000000;
    }

    public int heSo() {
        return Integer.parseInt(this.maGV.substring(2));
    }

    public int tongTien() {
        return heSo() * this.luongCB + phuCap();
    }

    public String toString() {
        return this.maGV + " " + this.hoTen + " " + heSo() + " " + phuCap() + " " + tongTien();
    }
}
