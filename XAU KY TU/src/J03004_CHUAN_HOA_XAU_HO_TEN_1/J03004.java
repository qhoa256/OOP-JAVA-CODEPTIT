package J03004_CHUAN_HOA_XAU_HO_TEN_1;

import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String res = "";
            for (String x : a) {
                String tmp = "";
                tmp += Character.toUpperCase(x.charAt(0));
                for (int j = 1; j < x.length(); j++) {
                    tmp += Character.toLowerCase(x.charAt(j));
                }
                res += tmp + " ";
            }
            System.out.println(res.trim());
        }
    }
}
