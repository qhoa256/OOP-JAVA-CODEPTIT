package J07036_BANG_DIEM_THEO_LOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07036 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, String> hoTen = new HashMap<>();
        HashMap<String, String> lop = new HashMap<>();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            String s4 = sc.nextLine();
            hoTen.put(s1, s2);
            lop.put(s1, s3);
        }
        sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, String> monHoc = new HashMap<>();
        while (n-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            monHoc.put(s1, s2);
        }
        sc = new Scanner(new File("BANGDIEM.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<sinhVien> sv = new ArrayList<>();
        while (m-- > 0) {
            String[] x = (sc.nextLine()).split("\\s+");
            String msv = x[0];
            String maMon = x[1];
            Double diem = Double.parseDouble(x[2]);
            sinhVien tmp = new sinhVien(msv, hoTen.get(msv), maMon, monHoc.get(maMon), lop.get(msv), diem);
            sv.add(tmp);
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getMaMon().compareTo(o2.getMaMon()) != 0) {
                    return o1.getMaMon().compareTo(o2.getMaMon());
                } else {
                    return o1.getMaSV().compareTo(o2.getMaSV());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String lopHoc = sc.nextLine();
            System.out.println("BANG DIEM lop " + lopHoc + ":");
            for (sinhVien x : sv) {
                if (x.getLop().equals(lopHoc)) {
                    System.out.println(x);
                }
            }
        }
    }
}
