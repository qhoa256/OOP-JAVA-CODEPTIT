package J07073_DANG_KY_HINH_THUC_GIANG_DAY;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<monHoc> mh = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            monHoc x = new monHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            mh.add(x);
        }
        Collections.sort(mh, new Comparator<monHoc>() {
            @Override
            public int compare(monHoc o1, monHoc o2) {
                return o1.getMaMon().compareTo(o2.getMaMon());
            }
        });
        for (monHoc x : mh) {
            if (!x.getThucHanh().equals("Truc tiep")) {
                System.out.println(x);
            }
        }
    }
}
