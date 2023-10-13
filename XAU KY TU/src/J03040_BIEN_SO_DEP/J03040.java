package J03040_BIEN_SO_DEP;

import java.util.Scanner;

public class J03040 {
    public static boolean check1(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) <= s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean check2(String s) {
        Character x = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != x) {
                return false;
            }
        }
        return true;
    }

    public static boolean check3(String s) {
        return s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4);
    }

    public static boolean check4(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.substring(5);
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    res += s.charAt(i);
                }
            }
            if(!check1(res) && !check2(res) && !check3(res) && !check4(res)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
