package J01006_TINH_SO_FIBONACCI;

import java.util.Scanner;

public class J01006 {
    public static long[] F = new long[93];

    public static void Fibo() {
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= 92; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo();
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            System.out.println(F[x]);
        }
    }
}
