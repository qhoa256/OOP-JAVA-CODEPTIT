package J01018_SO_KHONG_LIEN_KE;

import java.util.Scanner;

public class J01018 {

    public static boolean check(long n) {
        String s = "" + n;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
            if (i != 0) {
                int a = Character.getNumericValue(s.charAt(i));
                int b = Character.getNumericValue(s.charAt(i - 1));
                if (Math.abs(a - b) != 2) return false;
            }
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
