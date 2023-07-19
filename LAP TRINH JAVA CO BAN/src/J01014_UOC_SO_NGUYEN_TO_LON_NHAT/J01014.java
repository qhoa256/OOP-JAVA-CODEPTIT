package J01014_UOC_SO_NGUYEN_TO_LON_NHAT;

import java.util.Scanner;

public class J01014 {
    public static long Ptich(long n) {
        long res = (int) -1e9;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                res = Math.max(res, i);
            }
        }
        if (n != 1) res = Math.max(res, n);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(Ptich(n));
        }
    }
}
