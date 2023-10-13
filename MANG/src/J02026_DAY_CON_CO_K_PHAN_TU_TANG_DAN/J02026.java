package J02026_DAY_CON_CO_K_PHAN_TU_TANG_DAN;

import java.util.Arrays;
import java.util.Scanner;

public class J02026 {
    static int ok;

    public static void init(int x[], int n, int k) {
        for (int i = 1; i <= k; i++)
            x[i] = i;
    }

    public static void sinh(int x[], int n, int k) {
        int i = k;
        while (i >= 1 && x[i] == n - k + i)
            i--;
        if (i == 0) {
            ok = 0;
        } else {
            x[i]++;
            for (int j = i + 1; j <= k; j++)
                x[j] = x[j - 1] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a);
            int[] x = new int[n + 1];
            init(x, n, k);
            ok = 1;
            while (ok == 1) {
                for (int i = 1; i <= k; i++) System.out.print(a[x[i]] + " ");
                System.out.println();
                sinh(x, n, k);
            }
        }
    }
}
