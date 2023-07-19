package J05035_DANH_SACH_THUC_TAP_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            sv.add(new sinhVien("" + i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String dn = sc.nextLine();
            for (sinhVien x : sv) {
                if (x.getDoanhNghiep().compareTo(dn) == 0)
                    System.out.println(x);
            }
        }
    }
}
