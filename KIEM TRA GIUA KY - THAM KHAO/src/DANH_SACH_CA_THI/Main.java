package DANH_SACH_CA_THI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        ArrayList<monThi> mt = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            monThi x = new monThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mt.add(x);
        }
        sc = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            String d = "C" + String.format("%03d", i + 1);
            mt.get(i).setNgayThi(a);
            mt.get(i).setThoiGian(b);
            mt.get(i).setPhongThi(c);
            mt.get(i).setMaCaThi(d);
        }
        sc = new Scanner(new File("LICHTHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] x = s.split("\\s+");
            String mct = x[0];
            String mm = x[1];
            for (int j = 0; j < mt.size(); j++) {
                if (mt.get(j).getMaMon().equals(mm) && mt.get(j).getMaCaThi().equals(mct)) {
                    mt.get(j).setTenNhom(x[2]);
                    mt.get(j).setSoLuong(Integer.parseInt(x[3]));
                    break;
                }
            }
        }
        Collections.sort(mt, new Comparator<monThi>() {
            @Override
            public int compare(monThi o1, monThi o2) {
                if (o1.getNgay().compareTo(o2.getNgay()) != 0) {
                    return o1.getNgay().compareTo(o2.getNgay());
                } else {
                    return o1.getThoiGian().compareTo(o2.getThoiGian());
                }
            }
        });
        for (monThi x : mt) {
            System.out.println(x);
        }
    }
}
