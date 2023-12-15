package J06007_BANG_TINH_GIO_CHUAN;

import java.util.ArrayList;
import java.util.Scanner;

public class J06007 {
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
            GiangVien qh = new GiangVien(x[0], sb.toString(), mh);
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
                    qh.setGioChuan(qh.getGioChuan() + gio);
                    break;
                }
            }
        }
        for (GiangVien qh : gv) {
            System.out.println(qh);
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