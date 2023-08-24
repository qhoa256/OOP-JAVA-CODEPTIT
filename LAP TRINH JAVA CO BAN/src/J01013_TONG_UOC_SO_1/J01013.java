package J01013_TONG_UOC_SO_1;

import java.util.Scanner;

public class J01013 {
    public static int[] a = new int[2000001];

    public static void sieve() {
        a[1] = 1;
        for (int i = 2; i <= 1420; i++) {
            if (a[i] == 0) {
                for (int j = i * i; j <= 2000000; j += i) {
                    if (a[j] == 0)
                        a[j] = i;
                }
            }
        }
        for (int i = 2; i <= 2000000; i++) {
            if (a[i] == 0) {
                a[i] = i;
            }
        }
    }

    public static long Ptich(int n) {
        if (n == 1) return 1;
        long sum = 0;
        while (n != 1) {
            sum += a[n];
            n /= a[n];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();
        int t = sc.nextInt();
        long sum = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            sum += Ptich(n);
        }
        System.out.println(sum);
    }
}
