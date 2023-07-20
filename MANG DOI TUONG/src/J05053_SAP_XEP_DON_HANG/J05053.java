package J05053_SAP_XEP_DON_HANG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<donHang> dh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            dh.add(new donHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
        }
        Collections.sort(dh, new Comparator<donHang>() {
            @Override
            public int compare(donHang o1, donHang o2) {
                return o1.stt().compareTo(o2.stt());
            }
        });
        for (donHang x : dh) {
            System.out.println(x);
        }
    }
}
