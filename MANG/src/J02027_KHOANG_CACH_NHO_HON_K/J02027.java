package J02027_KHOANG_CACH_NHO_HON_K;

import java.util.Arrays;
import java.util.Scanner;

public class J02027 {
    public static int Lower_Bound(int a[], int l, int r, int x) {
        int pos = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] < x) {
                pos = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                int pos = Lower_Bound(a, i + 1, n - 1, a[i] + k);
                if (pos != -1) {
                    ans += (1L * pos - (1L * i + 1)) + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
