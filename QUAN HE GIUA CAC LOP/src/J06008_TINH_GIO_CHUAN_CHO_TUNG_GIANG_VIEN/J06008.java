package J06008_TINH_GIO_CHUAN_CHO_TUNG_GIANG_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J06008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MonHoc> mh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for (int j = 1; j < x.length; j++) {
                sb.append(x[j]);
                if (j != x.length - 1) {
                    sb.append(" ");
                }
            }
            MonHoc qh = new MonHoc(x[0], sb.toString());
            mh.add(qh);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> gv = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for (int j = 1; j < x.length; j++) {
                sb.append(x[j]);
                if (j != x.length - 1) {
                    sb.append(" ");
                }
            }
            GiangVien qh = new GiangVien(x[0], sb.toString());
            gv.add(qh);
        }
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < k; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            String maGV = x[0];
            String maMon = x[1];
            double gio = Double.parseDouble(x[2]);
            for (GiangVien qh : gv) {
                if (qh.getMaGV().equals(maGV)) {
                    qh.setTongGio(qh.getTongGio() + gio);
                    for (MonHoc qhoa : mh) {
                        if (qhoa.getMaMon().equals(maMon)) {
                            StringBuilder sb = new StringBuilder("");
                            sb.append(qhoa.getTenMon());
                            sb.append(" ");
                            sb.append(x[2]);
                            qh.dsMon.add(sb.toString());
                            break;
                        }
                    }
                    break;
                }
            }
        }
        String maGV = (sc.nextLine()).trim();
        for (GiangVien qh : gv) {
            if (qh.getMaGV().equals(maGV)) {
                System.out.println("Giang vien: " + qh.getTenGV());
                for (String z : qh.dsMon) {
                    System.out.println(z);
                }
                System.out.println("Tong: " + String.format("%.2f", qh.getTongGio()));
                return;
            }
        }
    }
}


//2
//INT1155 Tin hoc co so 2
//INT1306 Cau truc du lieu va giai thuat
//2
//GV01 Nguyen Van An
//GV02 Hoang Binh Minh
//2
//GV01 INT1155 113.2
//GV02 INT1306 126.72
//GV01