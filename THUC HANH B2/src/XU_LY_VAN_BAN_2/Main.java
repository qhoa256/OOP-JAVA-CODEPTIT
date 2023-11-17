package XU_LY_VAN_BAN_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static boolean check(String s) {
        boolean ok = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == ':') {
                return false;
            }
            if (Character.isDigit(s.charAt(i))) ok = true;
        }
        return ok;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s)) set.add(s);
        }
        for(String x:set){
            System.out.println(x);
        }
    }
}
