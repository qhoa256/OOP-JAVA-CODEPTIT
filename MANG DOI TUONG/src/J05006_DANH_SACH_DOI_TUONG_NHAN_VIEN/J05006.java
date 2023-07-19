package J05006_DANH_SACH_DOI_TUONG_NHAN_VIEN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<nhanVien> nv = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            nv.add(new nhanVien(String.format("%05d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (nhanVien x : nv) {
            System.out.println(x);
        }
    }
}
