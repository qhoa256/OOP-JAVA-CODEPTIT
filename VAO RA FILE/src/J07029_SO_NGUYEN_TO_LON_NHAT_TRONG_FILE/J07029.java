package J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07029 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (Integer x : a) {
            if (prime(x)) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        int cnt = 0;
        for (Integer x : map.keySet()) {
            System.out.println(x + " " + map.get(x));
            cnt++;
            if (cnt == 10) break;
        }
    }
}
