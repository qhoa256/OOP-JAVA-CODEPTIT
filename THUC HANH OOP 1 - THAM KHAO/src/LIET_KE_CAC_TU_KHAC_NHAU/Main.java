package LIET_KE_CAC_TU_KHAC_NHAU;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> set1 = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] a = s.trim().toLowerCase().split("\\s+");
            for (String x : a) {
                set1.add(x);
            }
        }
        int m = sc.nextInt();
        sc.nextLine();
        TreeSet<String> set2 = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String s = sc.nextLine();
            String[] a = s.trim().toLowerCase().split("\\s+");
            for (String x : a) {
                set2.add(x);
            }
        }
        for (String s : set1) {
            if (!set2.contains(s)) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        for (String s : set2) {
            if (!set1.contains(s)) {
                System.out.print(s + " ");
            }
        }
    }
}
