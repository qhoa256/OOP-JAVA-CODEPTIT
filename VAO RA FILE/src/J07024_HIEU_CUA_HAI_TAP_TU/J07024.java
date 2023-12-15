package J07024_HIEU_CUA_HAI_TAP_TU;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
