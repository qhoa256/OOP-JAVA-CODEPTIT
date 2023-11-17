package LICH_GIANG_DAY_THEO_GIANG_VIEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, String> map = new HashMap<>();
        ArrayList<nhomHP> nhp = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String soTC = sc.nextLine();
            map.put(maMon, tenMon);
        }
        sc = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            nhomHP x = new nhomHP("HP" + String.format("%03d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            nhp.add(x);
        }
        Collections.sort(nhp, new Comparator<nhomHP>() {
            @Override
            public int compare(nhomHP o1, nhomHP o2) {
                if (o1.getThu() != o2.getThu()) {
                    return o1.getThu() - o2.getThu();
                } else {
                    return o1.getKip() - o2.getKip();
                }
            }
        });
        String tenGiangVien = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tenGiangVien + ":");
        for (nhomHP x : nhp) {
            if (x.getTenGV().equals(tenGiangVien)) {
                System.out.println(x.getMaNhom() + " " + map.get(x.getMaMon()) + " " + x.getThu() + " " + x.getKip() + " " + x.getPhongHoc());
            }
        }
    }
}
