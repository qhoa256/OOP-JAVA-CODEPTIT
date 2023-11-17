package J07054_TINH_DIEM_TRUNG_BINH;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07054 {
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
                if(o1.diemTB()<o2.diemTB()) return 1;
                if(o1.diemTB()>o2.diemTB()) return -1;
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        sv.get(0).setXepHang(1);
        System.out.println(sv.get(0));
        for (int i = 1; i < n; i++) {
            if (sv.get(i).diemTB() == sv.get(i - 1).diemTB())
                sv.get(i).setXepHang(sv.get(i - 1).getXepHang());
            else
                sv.get(i).setXepHang(i + 1);
            System.out.println(sv.get(i));
        }
    }
}
