package J05017_HOA_DON_TIEN_NUOC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> kh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            kh.add(new KhachHang("KH" + String.format("%02d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(kh, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.tongTien() < o2.tongTien()) {
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

//3
//Le Thi Thanh
//468
//500
//Le Duc Cong
//160
//230
//Ha Hue Anh
//410
//612