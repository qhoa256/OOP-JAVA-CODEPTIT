package LICH_GIANG_DAY_THEO_GIANG_VIEN;

public class nhomHP {
    private String maMon, maNhom, tenGV, phongHoc;
    private int thu, kip;

    public nhomHP(String maNhom, String maMon, int thu, int kip, String tenGV, String phongHoc) {
        this.maNhom = maNhom;
        this.maMon = maMon;
        this.thu = thu;
        this.kip = kip;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }

    public String getMaNhom() {
        return maNhom;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public int getThu() {
        return thu;
    }

    public int getKip() {
        return kip;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getMaMon() {
        return maMon;
    }
}
