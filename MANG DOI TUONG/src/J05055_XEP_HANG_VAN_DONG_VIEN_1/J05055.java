package J05055_XEP_HANG_VAN_DONG_VIEN_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05055 {
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
                return o1.getMaVDV().compareTo(o2.getMaVDV());
            }
        });
        for (vdv x : v) {
            System.out.println(x);
        }
    }
}

//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30