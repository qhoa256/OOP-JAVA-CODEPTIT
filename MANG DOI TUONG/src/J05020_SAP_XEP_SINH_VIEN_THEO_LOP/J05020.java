package J05020_SAP_XEP_SINH_VIEN_THEO_LOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<sinhVien> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sv.add(new sinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.getLop().compareTo(o2.getLop()) != 0) {
                    return o1.getLop().compareTo(o2.getLop());
                } else {
                    return o1.getMaSV().compareTo(o2.getMaSV());
                }
            }
        });
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}
