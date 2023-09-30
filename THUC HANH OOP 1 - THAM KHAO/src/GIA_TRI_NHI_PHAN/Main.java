package GIA_TRI_NHI_PHAN;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
    public static String solve(String s) {
        String res = "";
        for (char x : s.toCharArray()) {
            if (x == '0' || x == '1')
                res += "" + x;
        }
        return res;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            String s1 = solve(s);
            long x = Long.parseLong(s1, 2);
            System.out.println(s1 + " " + x);
        }
    }
}
