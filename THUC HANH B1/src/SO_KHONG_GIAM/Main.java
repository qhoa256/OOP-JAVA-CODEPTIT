package SO_KHONG_GIAM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static boolean check(int x) {
        String s = x + "";
        if (s.length() < 2) return false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) < s.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        int[] cnt1 = new int[10005];
        int[] cnt2 = new int[10005];
        for (Integer x : a) {
            if (check(x)) {
                cnt1[x]++;
            }
        }
        for (Integer x : b) {
            if (check(x)) {
                cnt2[x]++;
            }
        }
        for (int i = 10; i <= 9999; i++) {
            if (cnt1[i] != 0 && cnt2[i] != 0) {
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
