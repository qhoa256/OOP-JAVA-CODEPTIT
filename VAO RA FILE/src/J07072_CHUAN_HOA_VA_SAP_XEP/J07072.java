package J07072_CHUAN_HOA_VA_SAP_XEP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07072 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Nguoi> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(new Nguoi(sc.nextLine()));
        }
        Collections.sort(list, new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi o1, Nguoi o2) {
                if (!o1.getTen().equals(o2.getTen())) {
                    return o1.getTen().compareTo(o2.getTen());
                } else {
                    return o1.getHo().compareTo(o2.getHo());
                }
            }
        });
        for (Nguoi x : list) {
            System.out.println(x);
        }
    }
}
