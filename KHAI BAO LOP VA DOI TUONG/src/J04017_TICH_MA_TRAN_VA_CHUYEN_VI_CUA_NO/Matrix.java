package J04017_TICH_MA_TRAN_VA_CHUYEN_VI_CUA_NO;

import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) this.a[i][j] = sc.nextInt();
        }
    }

    public Matrix trans() {
        Matrix res = new Matrix(this.m, this.n);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) res.a[j][i] = this.a[i][j];
        }
        return res;
    }

    public Matrix mul(Matrix p) {
        Matrix res = new Matrix(this.n, p.m);
        for (int i = 0; i < this.n; i++)
            for (int j = 0; j < p.m; j++) {
                for (int k = 0; k < this.m; k++) res.a[i][j] += this.a[i][k] * p.a[k][j];
            }
        return res;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) s += a[i][j] + "" + " ";
            s += "\n";
        }
        return s;
    }
}
