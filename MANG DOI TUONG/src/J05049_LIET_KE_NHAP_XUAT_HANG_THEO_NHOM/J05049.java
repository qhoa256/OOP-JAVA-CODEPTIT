package J05049_LIET_KE_NHAP_XUAT_HANG_THEO_NHOM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<matHang> mh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            mh.add(new matHang(sc.nextLine(), sc.nextLong()));
        }
        Collections.sort(mh, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                if (o1.thue() < o2.thue()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        String id = sc.next();
        for (matHang x : mh) {
            if (x.getMaHang().contentEquals(id)) {
                System.out.println(x);
            }
        }
    }
}
