package J05027_TIM_KIEM_GIANG_VIEN;

public class giangVien {
    private String maGV, hoTen, boMon;

    public giangVien() {
    }

    public giangVien(String maGV, String hoTen, String boMon) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.boMon = boMon;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getHoTen() {
        return this.hoTen.toUpperCase();
    }

    public String mon() {
        String res = this.boMon.toUpperCase();
        String[] a = res.split("\\s+");
        String tmp = "";
        for (String x : a) {
            tmp += x.charAt(0);
        }
        return tmp;
    }

    public String toString() {
        return this.maGV + " " + this.hoTen + " " + mon();
    }
}
