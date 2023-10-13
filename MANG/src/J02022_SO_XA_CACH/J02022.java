package J02022_SO_XA_CACH;

import java.util.Scanner;

public class J02022 {
    //Sinh hoán vị
    static int ok;

    public static void init(int a[], int n) {
        for (int i = 1; i <= n; i++)
            a[i] = i;
    }

    public static void sinh(int a[], int n) {
        int i = n - 1;
        while (i >= 1 && a[i] > a[i + 1])
            i--;
        if (i == 0) {
            ok = 0;
        } else {
            int j = n;
            while (a[i] > a[j])
                j--;
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            int l = i + 1, r = n;
            while (l < r) {
                int x = a[l];
                a[l] = a[r];
                a[r] = x;
                l++;
                r--;
            }
        }
    }

    public static boolean check(int a[], int n) {
        for (int i = 1; i <= n - 1; i++) {
            if (Math.abs(a[i] - a[i + 1]) == 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            init(a, n);
            ok = 1;
            while (ok == 1) {
                if (check(a, n)) {
                    for (int i = 1; i <= n; i++)
                        System.out.print(a[i]);
                    System.out.println();
                }
                sinh(a, n);
            }
            System.out.println();
        }
    }
}
