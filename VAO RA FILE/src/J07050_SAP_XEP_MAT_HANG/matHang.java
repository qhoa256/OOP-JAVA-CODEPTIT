package J07050_SAP_XEP_MAT_HANG;

public class matHang {
    private String maHang, tenHang, nhomHang;
    private double giaMua, giaBan;

    public matHang(String maHang, String tenHang, String nhomHang, double giaMua, double giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loiNhuan(){
        return this.giaBan-this.giaMua;
    }

    public String toString(){
        return this.maHang+" "+this.tenHang+" "+this.nhomHang+" "+String.format("%.2f", loiNhuan());
    }
}
