package J05068_SAP_XEP_BANG_GIA_XANG_DAU;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<donHang> dh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = (sc.nextLine()).trim().split("\\s+");
            donHang x = new donHang(s[0], Integer.parseInt(s[1]));
            String tmp = s[0].substring(3);
            if (tmp.equals("BP")) {
                x.setHangSX("British Petro");
            } else if (tmp.equals("ES")) {
                x.setHangSX("Esso");
            } else if (tmp.equals("SH")) {
                x.setHangSX("Shell");
            } else if (tmp.equals("CA")) {
                x.setHangSX("Castrol");
            } else if (tmp.equals("MO")) {
                x.setHangSX("Mobil");
            } else {
                x.setHangSX("Trong Nuoc");
            }
            dh.add(x);
        }
        Collections.sort(dh, new Comparator<donHang>() {
            @Override
            public int compare(donHang o1, donHang o2) {
                if (o1.thanhTien() < o2.thanhTien()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (donHang x : dh) {
            System.out.println(x);
        }
    }
}
