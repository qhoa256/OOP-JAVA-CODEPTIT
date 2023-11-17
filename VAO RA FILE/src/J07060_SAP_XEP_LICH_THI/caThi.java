package J07060_SAP_XEP_LICH_THI;

public class caThi {
    private String maCaThi, ngayThi, gioThi, phongThi, nhomThi, monThi;
    private int soLuong;

    public caThi(String maCaThi, String ngayThi, String gioThi, String phongThi) {
        this.maCaThi = maCaThi;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public void setNhomThi(String nhomThi) {
        this.nhomThi = nhomThi;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public String getNgayThi() {
        String[] x = ngayThi.split("/");
        StringBuilder sb = new StringBuilder("");
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }

    public String getGioThi() {
        return gioThi;
    }

    public void setMonThi(String monThi) {
        this.monThi = monThi;
    }

    public String toString() {
        return this.ngayThi + " " + this.gioThi + " " + this.phongThi + " " + this.monThi + " " + this.nhomThi + " " + this.soLuong;
    }
}
