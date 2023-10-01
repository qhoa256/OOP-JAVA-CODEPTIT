package BAO_CAO_THUC_TAP_CO_SO;

public class hoiDong implements Comparable<hoiDong>{
    private String maSV, maDeTai, maHoiDong;

    public hoiDong() {
    }

    public hoiDong(String maSV, String maDeTai, String maHoiDong) {
        this.maSV = maSV.trim();
        this.maDeTai = maDeTai.trim();
        this.maHoiDong = maHoiDong.trim();
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaDeTai() {
        return maDeTai;
    }

    public String getMaHoiDong() {
        return maHoiDong;
    }

    public int compareTo(hoiDong y){
        return this.maSV.compareTo(y.maSV);
    }
}
