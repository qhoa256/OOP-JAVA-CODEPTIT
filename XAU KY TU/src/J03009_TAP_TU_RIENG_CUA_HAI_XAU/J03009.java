package J03009_TAP_TU_RIENG_CUA_HAI_XAU;

import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a = s1.split("\\s+");
            String[] b = s2.split("\\s+");
            TreeSet<String> set1 = new TreeSet<>();
            TreeSet<String> set2 = new TreeSet<>();
            for (String x : a) {
                set1.add(x);
            }
            for (String x : b) {
                set2.add(x);
            }
            set1.removeAll(set2);
            for (String x : set1) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
