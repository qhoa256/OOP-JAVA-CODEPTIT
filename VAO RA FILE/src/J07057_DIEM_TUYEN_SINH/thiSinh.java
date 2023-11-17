package J07057_DIEM_TUYEN_SINH;

public class thiSinh {
    private String maTS, hoTen, danToc;
    private double diemThi;
    private int khuVuc;

    public thiSinh(String maTS, String hoTen, double diemThi, String danToc, int khuVuc) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.diemThi = diemThi;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
    }

    public void chuanHoa() {
        String[] x = hoTen.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < x.length; i++) {
            res += Character.toUpperCase(x[i].charAt(0));
            for (int j = 1; j < x[i].length(); j++) {
                res += Character.toLowerCase(x[i].charAt(j));
            }
            if (i != x.length - 1) res += " ";
        }
        hoTen = res;
    }

    public double tongDiem() {
        if (khuVuc == 1){
            if(danToc.compareTo("Kinh")!=0){
                return diemThi + 1.5 + 1.5;
            }else{
                return diemThi + 1.5;
            }
        }else if(khuVuc==2){
            if(danToc.compareTo("Kinh")!=0){
                return diemThi+1.5+1;
            }else{
                return diemThi+1;
            }
        }else{
            if(danToc.compareTo("Kinh")!=0){
                return diemThi+1.5;
            }else{
                return diemThi;
            }
        }
    }

    public String getMaTS() {
        return maTS;
    }

    public String toString() {
        chuanHoa();
        double diem = tongDiem();
        String loai = "";
        if (diem >= 20.5) {
            loai = "Do";
        } else {
            loai = "Truot";
        }
        return this.maTS + " " + this.hoTen + " " + String.format("%.1f", diem) + " " + loai;
    }
}
