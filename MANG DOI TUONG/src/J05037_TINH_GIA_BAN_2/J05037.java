package J05037_TINH_GIA_BAN_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<matHang> mh = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            mh.add(new matHang("MH" + String.format("%02d", i + 1), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(mh, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                return o2.giaBan() - o1.giaBan();
            }
        });
        for (matHang x : mh) {
            System.out.println(x);
        }
    }
}
