package J07071_TEN_VIET_TAT;

public class hoVaTen {
    private String hoTen, vietTat;

    public hoVaTen(String hoTen) {
        this.hoTen = hoTen;
        this.vietTat = tat();
    }

    public String tat() {
        String[] x = hoTen.trim().split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < x.length; i++) {
            sb.append(x[i].charAt(0));
            if (i != x.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public String getTen() {
        String[] x = hoTen.trim().split("\\s+");
        return x[x.length - 1];
    }

    public String getHo() {
        String[] x = hoTen.trim().split("\\s+");
        return x[0];
    }

    public String getVietTat() {
        return vietTat;
    }

    public String getHoTen() {
        return hoTen;
    }
}
