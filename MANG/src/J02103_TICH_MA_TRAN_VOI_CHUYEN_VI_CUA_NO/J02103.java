package J02103_TICH_MA_TRAN_VOI_CHUYEN_VI_CUA_NO;

import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int[][] res = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        res[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("Test " + x + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
