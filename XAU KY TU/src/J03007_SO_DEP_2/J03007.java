package J03007_SO_DEP_2;

import java.util.Scanner;

public class J03007 {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if (sb.toString().compareTo(s) != 0) return false;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum % 10 == 0 && s.charAt(0) == '8' && s.charAt(s.length() - 1) == '8';
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
