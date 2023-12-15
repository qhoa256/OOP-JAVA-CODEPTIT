package J05062_HOC_BONG_SINH_VIEN;

public class SinhVien {
    private String hoTen, loaiHB;
    private double gpa;
    private int drl;

    public SinhVien(String hoTen, double gpa, int drl) {
        this.hoTen = hoTen;
        this.gpa = gpa;
        this.drl = drl;
        hocBong();
    }

    public void hocBong(){
        if(this.gpa >= 3.6 && this.drl >= 90){
            this.loaiHB = "XUATSAC";
        }else if(this.gpa >= 3.2 && this.drl >= 80){
            this.loaiHB = "GIOI";
        }else if(this.gpa >= 2.5 && this.drl >= 70){
            this.loaiHB = "KHA";
        }else{
            this.loaiHB = "KHONG";
        }
    }
    public String getHoTen() {
        return hoTen;
    }

    public double getGpa() {
        return gpa;
    }

    public void setLoaiHB(String loaiHB) {
        this.loaiHB = loaiHB;
    }

    public String toString(){
        return this.hoTen + ": " + this.loaiHB;
    }
}
