package J02014_DIEM_CAN_BANG;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[1005];
            int[] F = new int[1005];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (i == 0) F[i] = a[i];
                else F[i] = F[i - 1] + a[i];
            }
            boolean ok = false;
            for (int i = 1; i < n - 1; i++) {
                if (F[i - 1] == (F[n - 1] - F[i])) {
                    ok = true;
                    System.out.print((i + 1) + " ");
                }
            }
            if (!ok) System.out.print(-1);
            System.out.println();
        }
    }
}
