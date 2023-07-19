package J03005_CHUAN_HOA_XAU_HO_TEN_2;

import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String res = "";
            for (int i = 1; i < a.length; i++) {
                res += Character.toUpperCase(a[i].charAt(0));
                for (int j = 1; j < a[i].length(); j++) {
                    res += Character.toLowerCase(a[i].charAt(j));
                }
                if (i != a.length - 1) res += " ";
            }
            res += ", " + a[0].toUpperCase();
            System.out.println(res);
        }
    }
}
