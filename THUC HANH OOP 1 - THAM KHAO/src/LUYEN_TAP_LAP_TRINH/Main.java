package LUYEN_TAP_LAP_TRINH;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        sinhVien[] sv = new sinhVien[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv[i] = new sinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getSoBai() != o2.getSoBai()) {
                    return o2.getSoBai() - o1.getSoBai();
                } else if (o1.getSubmit() != o2.getSubmit()) {
                    return o1.getSubmit() - o2.getSubmit();
                } else {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
            }
        });
        for (sinhVien x : sv)
            System.out.println(x);
    }
}
