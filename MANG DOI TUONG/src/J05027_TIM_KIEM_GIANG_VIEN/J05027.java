package J05027_TIM_KIEM_GIANG_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
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
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (giangVien x : gv) {
                if (x.getHoTen().contains(s.toUpperCase())) {
                    System.out.println(x);
                }
            }
        }
    }
}
