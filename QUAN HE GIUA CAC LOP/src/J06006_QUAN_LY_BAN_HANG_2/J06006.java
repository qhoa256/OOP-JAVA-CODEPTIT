package J06006_QUAN_LY_BAN_HANG_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J06006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> kh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            KhachHang x = new KhachHang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        ArrayList<MatHang> mh = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            MatHang x = new MatHang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            mh.add(x);
        }
        ArrayList<HoaDon> hd = new ArrayList<>();
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= k; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            HoaDon qh = new HoaDon("HD" + String.format("%03d", i), x[0].trim(), x[1].trim(), Long.parseLong(x[2]), kh, mh);
            hd.add(qh);
        }
        Collections.sort(hd, new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                if (o1.getLoiNhuan() < o2.getLoiNhuan()) return 1;
                if (o1.getLoiNhuan() > o2.getLoiNhuan()) return -1;
                return o1.getMaHD().compareTo(o2.getMaHD());
            }
        });
        for (HoaDon x : hd) {
            System.out.println(x);
        }
    }
}
