package J05069_CAU_LAC_BO_BONG_DA_1;

public class CLB {
    private String idCLB, tenCLB;
    private int giaVe;

    public CLB(String idCLB, String tenCLB, int giaVe) {
        this.idCLB = idCLB;
        this.tenCLB = tenCLB;
        this.giaVe= giaVe;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public String getIdCLB() {
        return idCLB;
    }

    public int getGiaVe() {
        return giaVe;
    }
}
