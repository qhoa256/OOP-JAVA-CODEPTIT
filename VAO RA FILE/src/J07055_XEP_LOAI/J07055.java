package J07055_XEP_LOAI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07055 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<sinhVien> sv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            sinhVien x = new sinhVien("SV" + String.format("%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            sv.add(x);
        }
        Collections.sort(sv, new Comparator<sinhVien>() {
            @Override
            public int compare(sinhVien o1, sinhVien o2) {
                if (o1.diemTB() < o2.diemTB()) return 1;
                else return -1;
            }
        });
        for (sinhVien x : sv) {
            System.out.println(x);
        }
    }
}
