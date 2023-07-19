package J05026_DANH_SACH_GIANG_VIEN_THEO_BO_MON;

import java.util.ArrayList;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<giangVien> gv = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            gv.add(new giangVien("GV" + String.format("%02d", i), sc.nextLine(), sc.nextLine()));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            String res = s;
            String[] a = res.split("\\s+");
            String tmp = "";
            for (String x : a) {
                tmp += x.charAt(0);
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + tmp + ":");
            for (giangVien x : gv) {
                if (x.mon().compareTo(tmp) == 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
