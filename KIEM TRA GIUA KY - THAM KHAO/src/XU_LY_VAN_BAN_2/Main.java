package XU_LY_VAN_BAN_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static boolean check(String s) {
        Character x = s.charAt(s.length() - 1);
        if (x == '.' || x == ',' || x == '!' || x == '?' || x == ':') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) a.add(s);
        }
        Collections.sort(a);
        for (String x : a) {
            System.out.println(x);
        }
    }
}
