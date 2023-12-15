package J05012_TINH_TIEN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> dh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            dh.add(new DonHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(dh, new Comparator<DonHang>() {
            @Override
            public int compare(DonHang o1, DonHang o2) {
                if (o1.tongTien() < o2.tongTien()) return 1;
                else return -1;
            }
        });
        for (DonHang x : dh) {
            System.out.println(x);
        }
    }
}

//3
//ML01
//May lanh SANYO
//12
//4000000
//2400000
//ML02
//May lanh HITACHI
//4
//2550000000
//0
//ML03
//May lanh NATIONAL
//5
//3000000
//150000