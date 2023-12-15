package J05013_TUYEN_DUNG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            NhanVien x = new NhanVien("TS" + String.format("%02d", i + 1), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            nv.add(x);
        }
        Collections.sort(nv, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.diemTB() < o2.diemTB()) return 1;
                else return -1;
            }
        });
        for (NhanVien x : nv) {
            System.out.println(x);
        }
    }
}

//3
//Nguyen Thai Binh
//45
//75
//Le Cong Hoa
//4
//4.5
//Phan Van Duc
//56
//56
