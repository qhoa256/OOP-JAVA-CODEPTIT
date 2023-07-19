package J02005_GIAO_CUA_HAI_DAY_SO;

import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> set1 = new TreeSet();
        TreeSet<Integer> set2 = new TreeSet();
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            set1.add(x);
        }
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            set2.add(x);
        }
        set1.retainAll(set2);
        for (Integer x : set1) {
            System.out.print(x + " ");
        }
    }
}
