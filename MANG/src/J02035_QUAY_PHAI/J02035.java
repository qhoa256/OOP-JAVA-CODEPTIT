package J02035_QUAY_PHAI;

import java.util.Scanner;

public class J02035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            int res = 1;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
                if (a[i] < a[i - 1]) {
                    res = i;
                }
            }
            System.out.println(res - 1);
        }
    }
}
