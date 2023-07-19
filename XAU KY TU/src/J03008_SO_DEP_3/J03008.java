package J03008_SO_DEP_3;

import java.util.Scanner;

public class J03008 {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if (sb.toString().compareTo(s) != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
