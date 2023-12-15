package J03022_XU_LY_VAN_BAN;

import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        while (sc.hasNext()) {
            String tmp = sc.next();
            s.append(tmp).append(" ");
        }
        s = new StringBuilder(s.toString().replace('?', '.'));
        s = new StringBuilder(s.toString().replace('!', '.'));
        s = new StringBuilder(s.toString().replace(". ", "."));
        s = new StringBuilder(s.toString().replace(" . ", "."));
        s = new StringBuilder(s.toString().replace(" .", "."));
        String[] a = s.toString().trim().split("\\.");
        for (String x : a)
            System.out.println(Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase());
    }
}
