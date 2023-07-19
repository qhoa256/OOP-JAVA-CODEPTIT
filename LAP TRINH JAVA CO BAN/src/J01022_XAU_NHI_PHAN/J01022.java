package J01022_XAU_NHI_PHAN;

import java.util.Scanner;

public class J01022 {
    public static long[] F = new long[93];

    public static void init() {
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= 92; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
    }

    public static int solve(long n, long k) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (k <= F[(int) (n - 2)]) return solve(n - 2, k);
        else return solve(n - 1, k - F[(int) (n - 2)]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}
