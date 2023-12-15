package J07016_SO_NGUYEN_TO_TRONG_HAI_FILE_NHI_PHAN;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class J07016 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) ois2.readObject();
        ArrayList<Integer> prime1 = new ArrayList<>();
        ArrayList<Integer> prime2 = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        TreeSet<Integer> res = new TreeSet<>();
        for (Integer x : a) {
            if (prime(x)) {
                res.add(x);
                prime1.add(x);
                if (map1.containsKey(x)) {
                    map1.put(x, map1.get(x) + 1);
                } else {
                    map1.put(x, 1);
                }
            }
        }

        for (Integer x : b) {
            if (prime(x)) {
                res.add(x);
                prime2.add(x);
                if (map2.containsKey(x)) {
                    map2.put(x, map2.get(x) + 1);
                } else {
                    map2.put(x, 1);
                }
            }
        }
        for (Integer x : res) {
            System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
        }
    }
}
