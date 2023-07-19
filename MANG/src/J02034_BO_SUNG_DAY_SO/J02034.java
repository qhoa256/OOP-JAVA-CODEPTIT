package J02034_BO_SUNG_DAY_SO;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int Max = (int) -1e9;
        for (int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            Max = Math.max(x, Max);
            set.add(x);
        }
        ;
        if (Max == set.size()) {
            System.out.println("Excellent!");
        } else {
            for (int i = 1; i <= Max; i++) {
                if (!set.contains(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
