package J07046_DANH_SACH_LUU_TRU;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07046 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            KhachHang x = new KhachHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        Collections.sort(kh, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.soNgay() < o2.soNgay()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (KhachHang x : kh) {
            System.out.println(x);
        }
    }
}
