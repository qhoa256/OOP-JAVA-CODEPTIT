package J01009_TONG_GIAI_THUA;

import java.util.Scanner;

public class J01009 {
    public static long factorial(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long res = 1;
            for (int j = 1; j <= i; j++) {
                res *= j;
            }
            sum += res;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(factorial(n));
    }
}
