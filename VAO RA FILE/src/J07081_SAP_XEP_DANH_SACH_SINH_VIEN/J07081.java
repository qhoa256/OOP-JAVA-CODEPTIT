package J07081_SAP_XEP_DANH_SACH_SINH_VIEN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07081 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sinhVien x = new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            sv.add(x);
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getTen().compareTo(o2.getTen()) != 0)
                    return o1.getTen().compareTo(o2.getTen());
                if (o1.getHo().compareTo(o2.getHo()) != 0)
                    return o1.getHo().compareTo(o2.getHo());
                if (o1.getTenDem().compareTo(o2.getTenDem()) != 0)
                    return o1.getTenDem().compareTo(o2.getTenDem());
                return o1.getMaSV().compareTo(o2.getMaSV());
            }

        });
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}
