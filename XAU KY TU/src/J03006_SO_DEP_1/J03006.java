package J03006_SO_DEP_1;

import java.util.Scanner;

public class J03006 {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if (sb.toString().compareTo(s) != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) % 2 != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
