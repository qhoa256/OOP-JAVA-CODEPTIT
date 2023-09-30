package SAP_XEP_MA_TRAN;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), i = sc.nextInt();
            i--;
            int[][] a = new int[n][m];
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    a[x][y] = sc.nextInt();
                }
            }
            for (int x = 0; x < n; x++) {
                for (int y = x + 1; y < n; y++) {
                    if (a[x][i] > a[y][i]) {
                        int tmp = a[x][i];
                        a[x][i] = a[y][i];
                        a[y][i] = tmp;
                    }
                }
            }
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < m; y++) {
                    System.out.print(a[x][y] + " ");
                }
                System.out.println();
            }
        }
    }
}
