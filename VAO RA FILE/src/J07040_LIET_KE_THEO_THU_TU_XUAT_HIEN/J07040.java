package J07040_LIET_KE_THEO_THU_TU_XUAT_HIEN;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> s = (ArrayList<String>) ois.readObject();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        for (String x : s) {
            String[] tmp = x.trim().toLowerCase().split("\\s+");
            for (String y : tmp) set1.add(y);
        }
        while (sc.hasNext()) {
            String tmp = sc.next().toLowerCase();
            set2.add(tmp);
        }
        for (String x : set2) {
            if (set1.contains(x)) System.out.println(x);
        }
    }
}
