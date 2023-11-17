package J07071_TEN_VIET_TAT;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J07071 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<hoVaTen> ht = new ArrayList<>();
        while (t-- > 0) {
            hoVaTen x = new hoVaTen(sc.nextLine());
            ht.add(x);
        }
        Collections.sort(ht, new Comparator<hoVaTen>() {
            @Override
            public int compare(hoVaTen o1, hoVaTen o2) {
                if (o1.getTen().compareTo(o2.getTen()) != 0) {
                    return o1.getTen().compareTo(o2.getTen());
                } else {
                    return o1.getHo().compareTo(o2.getHo());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String s = sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < ht.size(); i++) {
                if (ht.get(i).getVietTat().length() == s.length()) {
                    int cnt = 0;
                    for (int j = 0; j < ht.get(i).getVietTat().length(); j++) {
                        if (s.charAt(j) != ht.get(i).getVietTat().charAt(j)) {
                            cnt += 1;
                        }
                    }
                    if (cnt == 1) {
                        list.add(ht.get(i).getHoTen());
                    }
                }
            }
            for (String x : list) {
                System.out.println(x);
            }
        }
    }
}
