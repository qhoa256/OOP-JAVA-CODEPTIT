package J05051_SAP_XEP_BANG_TINH_TIEN_DIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<khachHang> kh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            kh.add(new khachHang("KH" + String.format("%02d", i + 1), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(kh, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                if (o1.tongTien() < o2.tongTien())
                    return 1;
                else return -1;
            }
        });
        for (khachHang x : kh) {
            System.out.println(x);
        }
    }
}
