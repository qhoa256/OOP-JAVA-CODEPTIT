package J05059_XAC_DINH_DANH_SACH_TRUNG_TUYEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ts = new ArrayList<>();
        while (t-- > 0) {
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ts.add(x);
        }
        Collections.sort(ts, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.xetTuyen() != o2.xetTuyen()) {
                    if (o1.xetTuyen() < o2.xetTuyen()) return 1;
                    else return -1;
                } else {
                    return o1.getMaTS().compareTo(o2.getMaTS());
                }
            }
        });
        int k = Integer.parseInt(sc.nextLine());
        double diemChuan = ts.get(k - 1).xetTuyen();
        System.out.printf("%.1f\n", diemChuan);
        for (ThiSinh x : ts) {
            System.out.print(x);
            if (x.xetTuyen() >= diemChuan) {
                System.out.println("TRUNG TUYEN");
            } else {
                System.out.println("TRUOT");
            }
        }
    }
}

//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV3B123
//Ly Thi Thu Ha
//8
//6.5
//7
//1