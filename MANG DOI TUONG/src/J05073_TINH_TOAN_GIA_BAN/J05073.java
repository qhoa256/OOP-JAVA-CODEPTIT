package J05073_TINH_TOAN_GIA_BAN;

import java.util.ArrayList;
import java.util.Scanner;

public class J05073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> dh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] x = (sc.nextLine()).trim().split("\\s+");
            DonHang qh = new DonHang(x[0], Long.parseLong(x[1]), Long.parseLong(x[2]));
            dh.add(qh);
        }
        for (DonHang x : dh) {
            System.out.println(x);
        }
    }
}

//2
//TTVC 400 300
//CCAK 200 200