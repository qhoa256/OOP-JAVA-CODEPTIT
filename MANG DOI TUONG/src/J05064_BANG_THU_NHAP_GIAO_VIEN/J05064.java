package J05064_BANG_THU_NHAP_GIAO_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<giaoVien> gv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        int ht = 0, hp = 0;
        while (n-- > 0) {
            String s = sc.nextLine();
            String chucVu = s.substring(0, 2);
            giaoVien x = new giaoVien(s, sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if (chucVu.equals("GV")) {
                gv.add(x);
            } else {
                if (chucVu.equals("HP")) {
                    if (hp < 2) {
                        gv.add(x);
                    }
                    hp++;
                } else {
                    if (ht < 1) {
                        gv.add(x);
                    }
                    ht++;
                }
            }
        }
        for (giaoVien x : gv) {
            System.out.println(x);
        }
    }
}
//3
//GV01
//Nguyen Kim Loan
//1420000
//HT05
//Hoang Thanh Tuan
//1780000
//GV02
//Tran Binh Nguyen
//1468000