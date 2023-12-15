package J01020_DAY_DU_CAC_CHU_SO;

import java.util.HashSet;
import java.util.Scanner;

public class J01020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long tmp = n;
            if (n == 0) {
                System.out.println("Impossible");
                continue;
            }
            HashSet<Character> set = new HashSet<>();
            while (true) {
                String s = n + "";
                for (char x : s.toCharArray()) {
                    set.add(x);
                }
                if (set.size() == 10) {
                    System.out.println(n);
                    break;
                }
                n += tmp;
            }
        }
    }
}

//5
//0
//1
//2
//11
//1692