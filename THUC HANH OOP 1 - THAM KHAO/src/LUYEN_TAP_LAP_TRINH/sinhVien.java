package LUYEN_TAP_LAP_TRINH;

public class sinhVien {
    private String hoTen;
    private int soBai, submit;

    public sinhVien(String hoTen, int soBai, int submit) {
        this.hoTen = hoTen;
        this.soBai = soBai;
        this.submit = submit;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getSoBai() {
        return soBai;
    }

    public int getSubmit() {
        return submit;
    }

    public String toString() {
        return this.hoTen.trim() + " " + this.soBai + " " + this.submit;
    }
}
