package J07027_QUAN_LY_BAI_TAP_NHOM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07027 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<sinhVien> sv = new ArrayList<>();
        while (n-- > 0) {
            sinhVien x = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(x);
        }
        HashMap<Integer, String> mp1 = new HashMap<>();
        sc = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            mp1.put(i, sc.nextLine());
        }
        sc = new Scanner(new File("NHOM.in"));
        HashMap<String, Integer> mp2 = new HashMap<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] x = s.trim().split("\\s+");
            mp2.put(x[0], Integer.parseInt(x[1]));
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        for (sinhVien x : sv) {
            System.out.print(x);
            Integer stt = mp2.get(x.getMaSV());
            System.out.println(" " + stt + " " + mp1.get(stt));
        }
    }
}
