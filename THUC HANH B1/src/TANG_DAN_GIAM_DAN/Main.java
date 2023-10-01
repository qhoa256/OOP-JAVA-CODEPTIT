package TANG_DAN_GIAM_DAN;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            TreeSet<Integer> even = new TreeSet<>();
            TreeSet<Integer> odd = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                Integer x = sc.nextInt();
                if (x % 2 == 0) {
                    even.add(x);
                } else {
                    odd.add(x);
                }
            }
            TreeSet<Integer> res = (TreeSet<Integer>) odd.descendingSet();
            for (Integer x : even) {
                System.out.print(x + " ");
            }
            System.out.println();
            for (Integer x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
