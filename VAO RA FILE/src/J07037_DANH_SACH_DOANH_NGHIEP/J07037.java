package J07037_DANH_SACH_DOANH_NGHIEP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<doanhNghiep> dn = new ArrayList<>();
        while (n-- > 0) {
            doanhNghiep x = new doanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            dn.add(x);
        }
        Collections.sort(dn, new Comparator<doanhNghiep>() {
            @Override
            public int compare(doanhNghiep o1, doanhNghiep o2) {
                return o1.getMaDN().compareTo(o2.getMaDN());
            }
        });
        for (doanhNghiep x : dn) {
            System.out.println(x);
        }
    }
}
