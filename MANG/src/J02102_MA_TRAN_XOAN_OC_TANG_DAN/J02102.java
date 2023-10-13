package J02102_MA_TRAN_XOAN_OC_TANG_DAN;

import java.util.Arrays;
import java.util.Scanner;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n * n];
        int res[][] = new int[n][n];
        for (int i = 0; i < n * n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        int row = n, column = n;
        int cnt = 0, x = 0;
        while (cnt < n * n) {
            for (int i = x; i < row; i++)
                res[x][i] = a[cnt++];
            for (int i = x + 1; i < row; i++)
                res[i][column - 1] = a[cnt++];
            for (int i = column - 2; i >= x; i--)
                res[row - 1][i] = a[cnt++];
            for (int i = row - 2; i > x; i--)
                res[i][x] = a[cnt++];
            row--;
            column--;
            x++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
}
