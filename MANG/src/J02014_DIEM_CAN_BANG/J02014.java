package J02014_DIEM_CAN_BANG;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int[] F = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                if (i == 1) F[i] = a[i];
                else F[i] = F[i - 1] + a[i];
            }
            boolean ok = false;
            for (int i = 1; i <= n; i++) {
                if (F[i] == (F[n] - F[i - 1])) {
                    ok = true;
                    System.out.print(i + " ");
                    break;
                }
            }
            if (!ok) System.out.print(-1);
            System.out.println();
        }
    }
}
