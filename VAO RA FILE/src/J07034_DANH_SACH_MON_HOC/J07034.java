package J07034_DANH_SACH_MON_HOC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<monHoc> mh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            monHoc x = new monHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mh.add(x);
        }
        Collections.sort(mh, new Comparator<monHoc>() {
            @Override
            public int compare(monHoc o1, monHoc o2) {
                return o1.getTenMon().compareTo(o2.getTenMon());
            }
        });
        for (monHoc x : mh) {
            System.out.println(x);
        }
    }
}
