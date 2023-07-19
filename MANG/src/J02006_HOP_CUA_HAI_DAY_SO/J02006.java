package J02006_HOP_CUA_HAI_DAY_SO;

import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < n + m; i++) {
            Integer x = sc.nextInt();
            set.add(x);
        }
        for (Integer x : set) {
            System.out.print(x + " ");
        }
    }
}
