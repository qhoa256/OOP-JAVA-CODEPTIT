package J05023_LIET_KE_SINH_VIEN_THEO_KHOA;

import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<sinhVien> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sv.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String khoa = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            for (sinhVien x : sv) {
                if (x.getMaSV().substring(1, 3).contentEquals(khoa.substring(2))) {
                    System.out.println(x);
                }
            }
        }
    }
}
