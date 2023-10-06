package J07015_SO_NGUYEN_TO_TRONG_FILE_NHI_PHAN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07015 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        int[] cnt = new int[100005];
        for (Integer x : a) {
            if(prime(x)) {
                ts.add(x);
                cnt[x]++;
            }
        }
        for (Integer x : ts) {
            System.out.println(x + " " + cnt[x]);
        }
    }
}
