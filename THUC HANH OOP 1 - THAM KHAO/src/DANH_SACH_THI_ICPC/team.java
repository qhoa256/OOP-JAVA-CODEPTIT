package DANH_SACH_THI_ICPC;

public class team {
    private String maTeam, tenTeam, tenTruong;

    public team(String maTeam, String tenTeam, String tenTruong) {
        this.maTeam = maTeam;
        this.tenTeam = tenTeam;
        this.tenTruong = tenTruong;
    }

    public String getMaTeam() {
        return maTeam;
    }

    public String getTenTeam() {
        return tenTeam;
    }

    public String getTenTruong() {
        return tenTruong;
    }
}
