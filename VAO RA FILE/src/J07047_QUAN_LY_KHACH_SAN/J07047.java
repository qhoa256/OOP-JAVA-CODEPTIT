package J07047_QUAN_LY_KHACH_SAN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07047 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Double> dg = new HashMap<>();
        HashMap<String, Double> ppv = new HashMap<>();
        while (t-- > 0) {
            String[] x = (sc.nextLine()).split("\\s+");
            dg.put(x[0], Double.parseDouble(x[2]));
            ppv.put(x[0], Double.parseDouble(x[3]));
        }
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<khachHang> kh = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            khachHang x = new khachHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        for (khachHang x : kh) {
            long ngay = x.soNgay();
            if(ngay == 0) ngay ++;
            double res = dg.get(x.ma()) * ngay * ppv.get(x.ma());
            double ans = dg.get(x.ma()) * ngay;
            double kq = 0.0;
            if (ngay >= 30) {
                kq = (res + ans) * 94.0 / 100.0;
            } else if (ngay >= 20) {
                kq = (res + ans) * 96.0 / 100.0;
            } else if (ngay >= 10) {
                kq = (res + ans) * 98.0 / 100.0;
            }else{
                kq = (res + ans) * 100 / 100.0;
            }
            x.setTongTien(kq);
        }
        Collections.sort(kh, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                if (o1.soNgay() < o2.soNgay()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (khachHang x : kh) {
            System.out.println(x);
        }
    }
}
