package DOC_FILE_NHI_PHAN_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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
        TreeSet<Integer>ts = new TreeSet<>();
        for(Integer x:a){
            ts.add(x);
        }
        for(Integer x:ts){
            System.out.println(x);
        }
    }
}
