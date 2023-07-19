package J05024_LIET_KE_SINH_VIEN_THEO_NGANH;

import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            sv.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String nganh = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            for (sinhVien x : sv) {
                if (x.getNganh().equalsIgnoreCase(nganh)) {
                    System.out.println(x);
                }
            }
        }
    }
}
