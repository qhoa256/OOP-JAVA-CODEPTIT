package J06002_SAP_XEP_HOA_DON_BAN_QUAN_AO;

public class SanPham {
    private String maSP, tenSP;

    private long giaLoai1, giaLoai2;

    public SanPham(String maSP, String tenSP, long giaLoai1, long giaLoai2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaLoai1 = giaLoai1;
        this.giaLoai2 = giaLoai2;
    }

    public long getGiaLoai1() {
        return giaLoai1;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public long getGiaLoai2() {
        return giaLoai2;
    }
}
