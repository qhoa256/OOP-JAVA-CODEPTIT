package TINH_TONG_SO_GIO_GIANG_DAY;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            sc.nextLine();
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        ArrayList<giangVien> gv = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String[] x = (sc.nextLine()).split("\\s+");
            String maGV = x[0];
            StringBuilder tenGV = new StringBuilder("");
            for (int j = 1; j < x.length; j++) {
                tenGV.append(x[j]);
                if (j != x.length - 1) {
                    tenGV.append(" ");
                }
            }
            giangVien tmp = new giangVien(maGV, tenGV.toString());
            gv.add(tmp);
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        HashMap<String, Double> map = new HashMap<>();
        int k = sc.nextInt();
        while (k-- > 0) {
            String maGV = sc.next();
            String maMon = sc.next();
            double gioDay = sc.nextDouble();
            if (map.containsKey(maGV)) {
                map.put(maGV, map.get(maGV) + gioDay);
            } else {
                map.put(maGV, gioDay);
            }
        }
        for (giangVien x : gv) {
            System.out.println(x.getTenGV() + " " + String.format("%.2f", map.get(x.getMaGV())));
        }
    }
}
