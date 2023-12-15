package J05082_DANH_SACH_KHACH_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<khachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            khachHang x = new khachHang("KH" + String.format("%03d", i), sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            kh.add(x);
        }
        Collections.sort(kh, new Comparator<khachHang>() {
            @Override
            public int compare(khachHang o1, khachHang o2) {
                return o1.tuoi().compareTo(o2.tuoi());
            }
        });
        for (khachHang x : kh) {
            System.out.println(x);
        }
    }
}

//2
//nGuyen VAN     nAm
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//TRan    vAn     biNh
//Nam
//14/11/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
