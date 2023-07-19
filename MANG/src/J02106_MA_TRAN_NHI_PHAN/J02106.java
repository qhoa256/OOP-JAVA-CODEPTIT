package J02106_MA_TRAN_NHI_PHAN;

import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 1][4];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            int cnt0 = 0, cnt1 = 0;
            for (int j = 1; j <= 3; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) cnt1++;
                else cnt0++;
            }
            if (cnt1 > cnt0) cnt++;
        }
        System.out.println(cnt);
    }
}
