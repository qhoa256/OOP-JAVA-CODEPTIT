package J03035_DIEN_CHU_SO;

import java.util.Scanner;

public class J03035 {
    static String s;
    static String b;
    static int cnt;

    static boolean check(String s) {
        String tmp = b.substring(0, s.length());
        return s.compareTo(tmp) > 0;
    }

    static void Try(int i) {
        if (i == s.length() + 1) {
            if (check(s)) {
                cnt++;
            }
            return;
        }
        if (s.charAt(i) == '?') {
            if (i == 0) {
                for (int j = 1; j <= 9; j++) {
                    s = s.substring(0, i) + (char) (j + '0') + s.substring(i + 1);
                    String substr = s.substring(0, i + 1);
                    if (check(substr)) {
                        Try(i + 1);
                    }
                    s = s.substring(0, i) + "?" + s.substring(i + 1);
                }
            } else {
                for (int j = 0; j <= 9; j++) {
                    s = s.substring(0, i) + (char) (j + '0') + s.substring(i + 1);
                    String substr = s.substring(0, i + 1);
                    if (check(substr)) {
                        Try(i + 1);
                    }
                    s = s.substring(0, i) + "?" + s.substring(i + 1);
                }
            }
        } else {
            Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            cnt = 0;
            s = sc.nextLine();
            b = sc.nextLine();
            Try(0);
            System.out.println(cnt);
        }
    }
}


