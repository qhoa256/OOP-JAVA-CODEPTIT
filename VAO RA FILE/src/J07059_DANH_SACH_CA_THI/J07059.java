package J07059_DANH_SACH_CA_THI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07059 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<caThi> ct = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            caThi x = new caThi("C" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ct.add(x);
        }
        Collections.sort(ct, new Comparator<caThi>() {
            @Override
            public int compare(caThi o1, caThi o2) {
                if (o1.getNgay().compareTo(o2.getNgay()) != 0) {
                    return o1.getNgay().compareTo(o2.getNgay());
                } else {
                    if (o1.getGioThi().compareTo(o2.getGioThi()) != 0) {
                        return o1.getGioThi().compareTo(o2.getGioThi());
                    } else {
                        return o1.getMaCaThi().compareTo(o2.getMaCaThi());
                    }
                }
            }
        });
        for(caThi x:ct){
            System.out.println(x);
        }
    }
}
