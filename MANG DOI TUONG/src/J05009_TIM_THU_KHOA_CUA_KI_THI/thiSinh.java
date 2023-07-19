package J05009_TIM_THU_KHOA_CUA_KI_THI;

public class thiSinh {
    private String maTS, hoTen, ngaySinh;
    private double diem1, diem2, diem3;

    public thiSinh() {
    }

    public thiSinh(String maTS, String hoTen, String ngaySinh, double diem1, double diem2, double diem3) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double tongDiem() {
        return this.diem1 + this.diem2 + this.diem3;
    }

    public String toString() {
        return this.maTS + " " + this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", tongDiem());
    }
}
