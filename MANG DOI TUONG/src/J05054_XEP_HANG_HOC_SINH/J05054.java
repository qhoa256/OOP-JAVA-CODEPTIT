package J05054_XEP_HANG_HOC_SINH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<hocSinh> hs = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            hs.add(new hocSinh("HS" + String.format("%02d", i), sc.nextLine(), sc.nextDouble()));
        }
        Collections.sort(hs, new Comparator<hocSinh>() {
            @Override
            public int compare(hocSinh o1, hocSinh o2) {
                if (o1.getDiemTB() > o2.getDiemTB())
                    return -1;
                else return 1;
            }
        });
        double xh = 0.0;
        double tmp = 0.0;
        double num = 1.0;
        for (hocSinh x : hs) {
            if (x.getDiemTB() != tmp) {
                xh += num;
                x.setXepHang(xh);
                tmp = x.getDiemTB();
            } else {
                num++;
                x.setXepHang(xh);
                tmp = x.getDiemTB();
            }
        }
        Collections.sort(hs, new Comparator<hocSinh>() {
            @Override
            public int compare(hocSinh o1, hocSinh o2) {
                return o1.getMaHS().compareTo(o2.getMaHS());
            }
        });
        for (hocSinh x : hs) {
            System.out.println(x);
        }
    }
}
