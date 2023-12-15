package J05070_CAU_LAC_BO_BONG_DA_2;

public class CLB {
    private String maCLB, tenCLB, maTran;
    private int giaVe, soLuong, doanhThu;

    public CLB(String maCLB, String tenCLB, int giaVe) {
        this.maCLB = maCLB;
        this.tenCLB = tenCLB;
        this.giaVe = giaVe;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int tongTien(){
        this.doanhThu = this.soLuong * this.giaVe;
        return this.doanhThu;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public void setMaTran(String maTran) {
        this.maTran = maTran;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public String toString(){
        return this.maTran + " " + this.tenCLB + " " + this.doanhThu;
    }
}
