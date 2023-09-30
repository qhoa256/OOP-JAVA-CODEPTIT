package SO_KHONG_GIAM;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static boolean check(int x) {
        String s = x + "";
        if (s.length() < 2) return false;
        for (int t = 0; t < s.length() - 1; t++) {
            if (s.charAt(t + 1) < s.charAt(t))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        int[] cnt1 = new int[10005];
        int[] cnt2 = new int[10005];
        for (int x : a) {
            if (check(x))
                cnt1[x]++;
        }
        for (int x : b) {
            if (check(x))
                cnt2[x]++;
        }
        for (int i = 10; i <= 9999; i++) {
            if (cnt1[i] != 0 && cnt2[i] != 0)
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
        }
    }
}
