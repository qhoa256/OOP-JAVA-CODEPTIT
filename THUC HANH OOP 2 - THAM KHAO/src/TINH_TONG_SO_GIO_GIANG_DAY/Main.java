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
        ArrayList<monHoc> mh = new ArrayList<>();
        while (n-- > 0) {
            String s = sc.nextLine();
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<giangVien> gv = new ArrayList<>();
        while (m-- > 0) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            String maGV = x[0];
            String tenGV = "";
            for (int i = 1; i < x.length; i++) {
                tenGV += x[i] + " ";
            }
            giangVien tmp = new giangVien(maGV, tenGV.trim());
            gv.add(tmp);
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        HashMap<String, Double> mp2 = new HashMap<>();
        int k = sc.nextInt();
        while (k-- > 0) {
            String maGV = sc.next();
            String maMon = sc.next();
            double gioDay = sc.nextDouble();
            if (mp2.containsKey(maGV)) {
                mp2.put(maGV, mp2.get(maGV) + gioDay);
            } else {
                mp2.put(maGV, gioDay);
            }
        }
        for (giangVien x : gv) {
            System.out.println(x.getTenGV() + " " + String.format("%.2f", mp2.get(x.getMaGV())));
        }
    }
}
