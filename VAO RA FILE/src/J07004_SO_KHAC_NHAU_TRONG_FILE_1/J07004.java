package J07004_SO_KHAC_NHAU_TRONG_FILE_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeSet<Integer> ts = new TreeSet<>();
        int[] cnt = new int[10005];
        while (sc.hasNext()) {
            int x = sc.nextInt();
            cnt[x]++;
            ts.add(x);
        }
        for (Integer x : ts) {
            System.out.println(x + " " + cnt[x]);
        }
    }
}
