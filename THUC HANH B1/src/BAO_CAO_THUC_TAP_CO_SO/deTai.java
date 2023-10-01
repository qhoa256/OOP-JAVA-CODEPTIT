package BAO_CAO_THUC_TAP_CO_SO;

public class deTai {
    private String maDeTai, giangVien, tenDeTai;

    public deTai() {
    }

    public deTai(String maDeTai, String giangVien, String tenDeTai) {
        this.maDeTai = maDeTai;
        this.giangVien = giangVien.trim();
        this.tenDeTai = tenDeTai.trim();
    }

    public String getGiangVien() {
        return giangVien;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public String getMaDeTai() {
        return maDeTai;
    }
}
