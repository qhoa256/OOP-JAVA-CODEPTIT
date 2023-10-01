package TANG_DAN_GIAM_DAN;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x;
            TreeSet<Integer> odd = new TreeSet<>();
            TreeSet<Integer> even = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                x = sc.nextInt();
                if (x % 2 == 0) {
                    even.add(x);
                } else {
                    odd.add(x);
                }
            }
            TreeSet<Integer> res = (TreeSet<Integer>) odd.descendingSet();
            for (Integer tmp : even) {
                System.out.print(tmp + " ");
            }
            System.out.println();
            for (Integer tmp : res) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }
}
