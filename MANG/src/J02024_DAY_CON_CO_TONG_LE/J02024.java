package J02024_DAY_CON_CO_TONG_LE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J02024 {
    static int ok;

    public static void init(int x[], int n) {
        for (int i = 0; i < n; i++)
            x[i] = 0;
    }

    public static void sinh(int x[], int n) {
        int i = n - 1;
        while (i >= 0 && x[i] == 1) {
            x[i] = 0;
            i--;
        }
        if (i == -1) ok = 0;
        else x[i] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a, new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return b - a;
                }
            });
            int[] x = new int[n];
            init(x, n);
            ok = 1;
            while (ok == 1) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum += a[i] * x[i];
                }
                if (sum % 2 == 1) {
                    for (int i = 0; i < n; i++) {
                        if (x[i] == 1) System.out.print(a[i] + " ");
                    }
                    System.out.println();
                }
                sinh(x, n);
            }
        }
    }
}
