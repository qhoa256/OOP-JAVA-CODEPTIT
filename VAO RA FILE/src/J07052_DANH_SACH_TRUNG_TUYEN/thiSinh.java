package J07052_DANH_SACH_TRUNG_TUYEN;

public class thiSinh {
    private String maTS, hoTen;
    private double diemToan, diemLy, diemHoa;

    public thiSinh(String maTS, String hoTen, double diemToan, double diemLy, double diemHoa) {
        this.maTS = maTS;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void chuanHoa() {
        String[] x = hoTen.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < x.length; i++) {
            res += Character.toUpperCase(x[i].charAt(0));
            for (int j = 1; j < x[i].length(); j++) {
                res += Character.toLowerCase(x[i].charAt(j));
            }
            if (i != x.length - 1) {
                res += " ";
            }
        }
        hoTen = res;
    }

    public double uuTien() {
        String res = maTS.substring(0, 3);
        if (res.equals("KV1")) return 0.5;
        else if (res.equals("KV2")) return 1.0;
        else return 2.5;
    }

    public String getMaTS() {
        return maTS;
    }

    public double xetTuyen() {
        return this.diemToan + this.diemHoa + this.diemLy + uuTien();
    }

    public void out() {
        chuanHoa();
        System.out.print(this.maTS + " " + this.hoTen + " ");
        if(uuTien() == (int)uuTien()){
            System.out.print((int)uuTien() + " ");
        }else{
            System.out.println(String.format("%.1f", uuTien()) + " ");
        }
        if(xetTuyen() == (int)xetTuyen()){
            System.out.println((int)(xetTuyen())+" ");
        }else{
            System.out.println(String.format("%.1f", xetTuyen())+" ");
        }
    }
}
