package J05080_LOP_HOC_PHAN_2;

public class lopHoc {
    private String maMon, tenMon, nhomLop, giangVien;

    public lopHoc(String maMon, String tenMon, String nhomLop, String giangVien) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.nhomLop = nhomLop;
        this.giangVien = giangVien;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getNhomLop() {
        return nhomLop;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.nhomLop;
    }
}

