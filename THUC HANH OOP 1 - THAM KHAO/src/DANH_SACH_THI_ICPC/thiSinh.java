package DANH_SACH_THI_ICPC;

public class thiSinh {
    private String maTS, hoTen, maTeam;

    public thiSinh(String maTS, String hoTen, String maTeam) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.maTeam = maTeam;
    }

    public String getMaTeam() {
        return maTeam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String toString(){
        return this.maTS + " " + this.hoTen;
    }
}
