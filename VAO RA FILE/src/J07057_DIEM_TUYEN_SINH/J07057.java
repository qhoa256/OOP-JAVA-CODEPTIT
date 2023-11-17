package J07057_DIEM_TUYEN_SINH;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07057 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<thiSinh> ts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            thiSinh x = new thiSinh("TS" + String.format("%02d", i), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ts.add(x);
        }
        Collections.sort(ts, new Comparator<thiSinh>() {
            @Override
            public int compare(thiSinh o1, thiSinh o2) {
                if (o1.tongDiem() < o2.tongDiem()) return 1;
                if (o1.tongDiem() > o2.tongDiem()) return -1;
                return o1.getMaTS().compareTo(o2.getMaTS());
            }
        });
        for (thiSinh x : ts) {
            System.out.println(x);
        }
    }
}
