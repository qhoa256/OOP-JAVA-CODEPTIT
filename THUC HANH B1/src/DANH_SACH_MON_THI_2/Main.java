package DANH_SACH_MON_THI_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashSet<String> set = new HashSet<>();
        ArrayList<monHoc> mh = new ArrayList<>();
        while (sc.hasNextLine()) {
            monHoc x = new monHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if (!set.contains(x.getMaMon())) {
                mh.add(x);
            }
            set.add(x.getMaMon());
        }
        Collections.sort(mh, new Comparator<monHoc>() {
            @Override
            public int compare(monHoc o1, monHoc o2) {
                return o1.getMaMon().compareTo(o2.getMaMon());
            }
        });
        for (monHoc x : mh) {
            System.out.println(x);
        }
    }
}
