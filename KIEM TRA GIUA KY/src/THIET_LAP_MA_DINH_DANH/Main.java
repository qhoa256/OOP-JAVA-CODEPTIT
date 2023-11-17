package THIET_LAP_MA_DINH_DANH;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a = (ArrayList<String>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) ois1.readObject();
        TreeSet<String> set = new TreeSet<>();
        for (String x : a) {
            for (Integer y : b) {
                String res = x + "" + y;
            }
        }
        for(String x:set){
            System.out.println(x);
        }
    }
}
