package J05067_QUAN_LY_KHO_XANG_DAU;

import java.util.ArrayList;
import java.util.Scanner;

public class J05067 {
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
        for (donHang x : dh) {
            System.out.println(x);
        }
    }
}

//4
//N89BP 4500
//D00BP 3500
//X92SH 2600
//Q25TN 2560