package J01010_CAT_DOI;

import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int cnt = 0;
            String s = sc.nextLine();
            int ok = 1;
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                Character x = s.charAt(i);
                if (x == '0' || x == '8' || x == '9') {
                    res += "0";
                } else if (x == '1') {
                    res += "1";
                } else {
                    ok = 0;
                    break;
                }
            }
            for (int i = 0; i < res.length(); i++) {
                if (res.charAt(i) == '0') cnt++;
            }
            if (cnt == res.length()) ok = 0;
            if (ok == 0) {
                System.out.println("INVALID");
            } else {
                System.out.println(Long.parseLong(res));
            }
        }
    }
}
