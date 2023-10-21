package LOG_THOI_GIAN;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static boolean check(String s) {
        if (s.charAt(2) != ':' || s.charAt(5) != ':') {
            return false;
        }
        int gio = Integer.parseInt("" + s.charAt(0) + s.charAt(1));
        int phut = Integer.parseInt("" + s.charAt(3) + s.charAt(4));
        int giay = Integer.parseInt("" + s.charAt(6) + s.charAt(7));
        if (gio > 23 || phut > 59 || giay > 59) return false;
        if (s.length() == 8) return true;
        return s.charAt(8) == ' ' || s.charAt(8) == '\t' || s.charAt(8) == ',' || s.charAt(8) == '.' || s.charAt(8) == '\n';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            s = sc.nextLine();
            if (s.length() < 8) continue;
            int i = 0;
            while (i < s.length()) {
                String tmp = s.substring(i);
                boolean qhoa = false;
                if (tmp.length() >= 8) {
                    qhoa = check(tmp);
                }
                if (Character.isDigit(s.charAt(i)) && qhoa && (i == 0 || s.charAt(i - 1) == ' ' || s.charAt(i - 1) == '\t' || s.charAt(i - 1) == '.' || s.charAt(i - 1) == ',' || s.charAt(i - 1) == '\n')) {
                    set.add(s.substring(i, i + 8));
                    i += 8;
                } else {
                    i += 1;
                }
            }
        }
        for (String x : set) {
            System.out.println(x);
        }
    }
}
