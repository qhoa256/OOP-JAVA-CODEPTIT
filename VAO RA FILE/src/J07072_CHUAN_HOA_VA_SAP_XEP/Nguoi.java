package J07072_CHUAN_HOA_VA_SAP_XEP;

public class Nguoi {
    private String hoTen, ten, ho, tenDem;

    public Nguoi(String hoTen) {
        this.hoTen = hoTen;
        chuanHoa();
    }

    public void chuanHoa() {
        String[] x = hoTen.trim().split("\\s+");
        StringBuilder ho = new StringBuilder("");
        for (int i = 0; i < x.length - 1; i++) {
            ho.append(Character.toUpperCase(x[i].charAt(0)));
            for (int j = 1; j < x[i].length(); j++) {
                ho.append(Character.toLowerCase(x[i].charAt(j)));
            }
            if (i != x.length - 2) {
                ho.append(" ");
            }
        }
        StringBuilder ten = new StringBuilder("");
        ten.append(Character.toUpperCase(x[x.length - 1].charAt(0)));
        for (int i = 1; i < x[x.length - 1].length(); i++) {
            ten.append(Character.toLowerCase(x[x.length - 1].charAt(i)));
        }
        this.ho = ho.toString();
        this.ten = ten.toString();
        this.hoTen = ho.append(" ").append(ten).toString();
    }

    public String getTen() {
        return ten;
    }

    public String getHo() {
        return ho;
    }

    public String toString() {
        return this.hoTen;
    }
}
