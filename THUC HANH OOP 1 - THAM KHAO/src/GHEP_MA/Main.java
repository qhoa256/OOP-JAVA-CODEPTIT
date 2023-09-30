package GHEP_MA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a = (ArrayList<String>) in1.readObject();
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        TreeSet<String> ts = new TreeSet<>();
        for (String x : a) {
            for (int y : b) {
                String tmp = x + (y + "");
                ts.add(tmp);
            }
        }
        for (String x : ts) {
            System.out.println(x);
        }
    }
}
