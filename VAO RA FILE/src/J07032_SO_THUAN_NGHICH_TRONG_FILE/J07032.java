package J07032_SO_THUAN_NGHICH_TRONG_FILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07032 {
    public static boolean check(int x) {
        String res = "" + x;
        StringBuilder sb = new StringBuilder(res);
        sb.reverse();
        if (sb.toString().compareTo(res) != 0) return false;
        if (res.length() % 2 == 0 || res.length() == 1) return false;
        for (char y : res.toCharArray()) {
            if ((y - '0') % 2 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        int[] cnt1 = new int[1000005];
        int[] cnt2 = new int[1000005];
        for (Integer x : a) {
            if (check(x))
                cnt1[x]++;
        }
        for (Integer x : b) {
            if (check(x))
                cnt2[x]++;
        }
        int dem = 0;
        for (int i = 10; i <= 1000004; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + (cnt1[i] + cnt2[i]));
                dem++;
                if (dem == 10) break;
            }
        }
    }
}
