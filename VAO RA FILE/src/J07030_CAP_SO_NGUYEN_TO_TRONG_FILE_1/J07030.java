package J07030_CAP_SO_NGUYEN_TO_TRONG_FILE_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07030 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();

        TreeMap<Integer, Integer> res = new TreeMap<>();
        for (Integer x : a)
            if (prime(x) && x < 500000) {
                int y = 1000000 - x;
                if (prime(y)) {
                    int k = b.indexOf(y);
                    if (k != -1) res.put(x, y);
                }
            }
        for (Integer x : res.keySet())
            System.out.println(x + " " + res.get(x));
    }
}
