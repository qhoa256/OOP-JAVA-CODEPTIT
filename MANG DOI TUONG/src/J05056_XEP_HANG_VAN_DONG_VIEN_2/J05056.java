package J05056_XEP_HANG_VAN_DONG_VIEN_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<vdv> v = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            vdv x = new vdv("VDV" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            v.add(x);
        }
        Collections.sort(v, new Comparator<vdv>() {
            @Override
            public int compare(vdv o1, vdv o2) {
                if (o1.tinhThoiGian().compareTo(o2.tinhThoiGian()) < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        v.get(0).setXepHang(1);
        for (int i = 1; i < t; i++) {
            if (v.get(i).tinhThoiGian().equals(v.get(i - 1).tinhThoiGian())) {
                v.get(i).setXepHang(v.get(i - 1).getXepHang());
            } else {
                v.get(i).setXepHang(i + 1);
            }
        }
        Collections.sort(v, new Comparator<vdv>() {
            @Override
            public int compare(vdv o1, vdv o2) {
                if (o1.getXepHang() != o2.getXepHang()) {
                    if (o1.getXepHang() < o2.getXepHang()) return -1;
                    else return 1;
                } else {
                    return o1.getMaVDV().compareTo(o2.getMaVDV());
                }
            }
        });
        for (vdv x : v) {
            System.out.println(x);
        }
    }
}
