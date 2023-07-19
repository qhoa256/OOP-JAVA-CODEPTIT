package J02020_LIET_KE_TO_HOP_1;

import java.util.Scanner;

public class J02020 {
    public static int n, k;
    public static int[] x = new int[25];

    public static int cnt = 0;

    public static void Try(int i) {
        for (int j = x[i - 1] + 1; j <= n - k + i; j++) {
            x[i] = j;
            if (i == k) {
                cnt++;
                for (int h = 1; h <= k; h++) {
                    System.out.print(x[h] + " ");
                }
                System.out.println();
            } else Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        n = x;
        k = y;
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
