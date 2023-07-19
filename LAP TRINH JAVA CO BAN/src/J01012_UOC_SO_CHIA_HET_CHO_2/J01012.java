package J01012_UOC_SO_CHIA_HET_CHO_2;

import java.util.Scanner;

public class J01012 {
    public static int divisor2(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i % 2 == 0)
                    cnt++;
                if (i != n / i) {
                    if ((n / i) % 2 == 0) cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(divisor2(n));
        }
    }
}
