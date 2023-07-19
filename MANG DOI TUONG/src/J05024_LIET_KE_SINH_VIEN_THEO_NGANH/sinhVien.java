package J05024_LIET_KE_SINH_VIEN_THEO_NGANH;

public class sinhVien {
    private String maSV, hoTen, lop, email;

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getNganh(){
        String s = "";
        if(this.maSV.contains("DCKT"))  s = "Ke toan";
        if(this.maSV.contains("DCVT"))  s = "Vien thong";
        if(this.maSV.contains("DCDT"))  s = "Dien tu";
        if(this.maSV.contains("DCCN") && this.lop.charAt(0) != 'E')  s = "Cong nghe thong tin";
        if(this.maSV.contains("DCAT") && this.lop.charAt(0) != 'E')  s = "An toan thong tin";
        return s;
    }

    public String toString() {
        return this.maSV + " " + this.hoTen + " " + this.lop + " " + this.email;
    }
}
