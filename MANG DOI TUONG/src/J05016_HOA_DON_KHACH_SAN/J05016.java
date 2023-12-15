package J05016_HOA_DON_KHACH_SAN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> kh = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            kh.add(new KhachHang("KH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(kh, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if (o1.tongTien() < o2.tongTien()) return 1;
                else return -1;
            }
        });
        for (KhachHang x : kh) {
            System.out.println(x);
        }
    }
}

//3
//Huynh Van Thanh
//103
//05/06/2010
//05/06/2010
//15
//Le Duc Cong
//106
//08/03/2010
//01/05/2010
//220
//Tran Thi Bich Tuyen
//207
//10/04/2010
//21/04/2010
//96