package J02023_LUA_CHON_THAM_LAM;

import java.util.Scanner;
import java.util.Stack;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        if (9 * n < s || n > 1 && s == 0) {
            System.out.print("-1 -1");
            return;
        }
        int n2 = n, s2 = s;
        // Tim Min
        s -= 1;
        int[] minNum = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (s >= 9) {
                minNum[i] = 9;
                s -= 9;
            } else {
                minNum[i] = s;
                break;
            }
        }
        minNum[0] += 1;
        for (int x : minNum) {
            System.out.print(x);
        }
        System.out.print(" ");
        // Tim Max
        int[] maxNum = new int[n2];
        for (int i = 0; i < n; i++) {
            if (s2 >= 9) {
                maxNum[i] = 9;
                s2 -= 9;
            } else {
                maxNum[i] = s2;
                break;
            }
        }
        for (int x : maxNum) {
            System.out.print(x);
        }
    }
}
