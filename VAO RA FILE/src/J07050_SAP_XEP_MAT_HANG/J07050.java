package J07050_SAP_XEP_MAT_HANG;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<matHang> mh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            matHang x = new matHang("MH" + String.format("%02d", i), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            mh.add(x);
        }
        Collections.sort(mh, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                if (o1.loiNhuan() < o2.loiNhuan()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        for (matHang x : mh) {
            System.out.println(x);
        }
    }
}
