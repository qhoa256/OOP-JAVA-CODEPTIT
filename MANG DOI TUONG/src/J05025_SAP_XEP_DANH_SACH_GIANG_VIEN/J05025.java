package J05025_SAP_XEP_DANH_SACH_GIANG_VIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<giangVien> gv = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            gv.add(new giangVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(gv, new SortGV());
        for (giangVien x : gv) {
            System.out.println(x);
        }
    }
}
