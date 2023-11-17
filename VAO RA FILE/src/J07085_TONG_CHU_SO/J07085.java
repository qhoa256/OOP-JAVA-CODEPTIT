package J07085_TONG_CHU_SO;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {
    public static int sum(String s) {
        int res = 0;
        for (char x : s.toCharArray())
            res += (x - '0');
        return res;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        ArrayList<String> a = new ArrayList<>();
//        a.add("Jhsf00dklT12uhf780LPPZH");
//        a.add("AAAAddd0000000000000000001T");
//        oos.writeObject(a);
//        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        for (String s : a) {
            String res = "";
            for (Character x : s.toCharArray()) {
                if (Character.isDigit(x)) {
                    res += x;
                }
            }
            BigInteger x = new BigInteger(res);
            System.out.println(x.toString() + " " + sum(res));
        }
    }
}
