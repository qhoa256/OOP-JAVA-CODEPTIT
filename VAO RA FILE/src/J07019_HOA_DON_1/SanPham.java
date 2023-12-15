package J07019_HOA_DON_1;

public class SanPham {
    private String maLoai, tenSP;
    private int giaLoai1, giaLoai2;

    public SanPham(String maLoai, String tenSP, int giaLoai1, int giaLoai2) {
        this.maLoai = maLoai;
        this.tenSP = tenSP;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getGiaLoai1() {
        return giaLoai1;
    }

    public int getGiaLoai2() {
        return giaLoai2;
    }
}
