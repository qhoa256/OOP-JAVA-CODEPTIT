package XAU_NHI_PHAN_DOI_XUNG_DO_DAI_CHAN;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n, ok;
    public static int[] a = new int[100];
    public static void init() {
        for (int i = 1; i <= n; i++) {
            a[i] = 0;
        }
        ok=1;
    }
    public static void sinh() {
        int i = n;
        while (i >= 1 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i == 0) {
            ok = 0;
        } else {
            a[i] = 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            int num = 2;
            while (num <= n1) {
                n = num / 2;
                init();
                while (ok == 1) {
                    for (int i = 1; i <= n; i++) System.out.print(a[i]);
                    for (int i = 1; i <= n; i++) System.out.print(a[n - i + 1]);
                    System.out.print(" ");
                    sinh();
                }
                num += 2;
            }
            System.out.println();
        }
    }
}
