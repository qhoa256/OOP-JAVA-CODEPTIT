package J07059_DANH_SACH_CA_THI;

public class caThi {
    private String maCaThi, ngayThi, gioThi, phongThi;

    public caThi(String maCaThi, String ngayThi, String gioThi, String phongThi) {
        this.maCaThi = maCaThi;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }

    public String getMaCaThi() {
        return maCaThi;
    }

    public String getGioThi() {
        return gioThi;
    }

    public String getNgay() {
        String[] x = ngayThi.split("/");
        StringBuilder sb = new StringBuilder("");
        sb.append(x[2]);
        sb.append(x[1]);
        sb.append(x[0]);
        return sb.toString();
    }

    public String toString() {
        return this.maCaThi + " " + this.ngayThi + " " + this.gioThi + " " + this.phongThi;
    }
}
