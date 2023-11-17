package SO_DEP_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static boolean check(Integer x) {
        if (x < 10) return false;
        String res = "" + x;
        for (int i = 1; i < res.length(); i++) {
            if (res.charAt(i) > res.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        TreeSet<Integer> set = new TreeSet<>();
        int[] cnt1 = new int[100005];
        int[] cnt2 = new int[100005];
        for (Integer x : a) {
            if (check(x)) {
                cnt1[x]++;
                set.add(x);
            }
        }
        for (Integer x : b) {
            if (check(x)) {
                cnt2[x]++;
                set.add(x);
            }
        }
        for (Integer x : set) {
            if (cnt1[x] > 0 && cnt2[x] > 0) {
                System.out.println(x + " " + cnt1[x] + " " + cnt2[x]);
            }
        }
    }
}
