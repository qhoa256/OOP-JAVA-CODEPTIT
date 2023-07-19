package J04015_TINH_THU_NHAP_GIAO_VIEN;

public class giaoVien {
    private String maNgach, hoTen;
    private int luongCB;

    public giaoVien() {
    }

    public giaoVien(String maNgach, String hoTen, int luongCB) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }


    public String chucVu() {
        return maNgach.substring(0, 2);
    }

    public int heSo() {
        return Integer.parseInt(maNgach.substring(2));
    }

    public int phuCap() {
        if (chucVu().equals("HT")) {
            return 2000000;
        } else if (chucVu().equals("HP")) {
            return 900000;
        } else {
            return 500000;
        }
    }

    public String toString() {
        return this.maNgach + " " + this.hoTen + " " + heSo() + " " + phuCap() + " " + (this.luongCB * heSo() + phuCap());
    }
}
