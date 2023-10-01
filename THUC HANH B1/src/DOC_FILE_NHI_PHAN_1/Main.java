package DOC_FILE_NHI_PHAN_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static boolean prime(int n) {
        if (n < 100) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        for (Integer x : a) {
            if (prime(x))
                ts.add(x);
        }
        for (Integer x : ts) {
            System.out.println(x);
        }
    }
}
