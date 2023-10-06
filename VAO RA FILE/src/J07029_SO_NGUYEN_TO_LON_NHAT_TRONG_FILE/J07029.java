package J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07029 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        TreeSet<Integer>ts = new TreeSet<>();
        int []cnt = new int[100005];
        for(Integer x:a){
            if(prime(x)){
                ts.add(x);
            }
        }
    }
}
