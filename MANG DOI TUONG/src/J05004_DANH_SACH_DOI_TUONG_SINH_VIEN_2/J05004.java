package J05004_DANH_SACH_DOI_TUONG_SINH_VIEN_2;

import java.util.ArrayList;
import java.util.Scanner;

public class J05004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<sinhVien> sv = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv.add(new sinhVien("B20DCCN" + String.format("%03d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}
