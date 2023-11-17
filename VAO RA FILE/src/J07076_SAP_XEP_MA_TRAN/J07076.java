package J07076_SAP_XEP_MA_TRAN;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Matrix {
    public int n, m, k;
    public int[][] a;

    public Matrix(int n, int m, int k) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
        this.k = k - 1;
    }

    ArrayList<Integer> tmp = new ArrayList<>();

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.a[i][j] = sc.nextInt();
            }
        }
    }

    public String toString() {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == k) {
                    tmp.add(this.a[i][j]);
                }
            }
        }
        Collections.sort(tmp);
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                if (j == k) {
                    s.append(tmp.get(i) + " ");
                } else {
                    s.append(this.a[i][j] + " ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }
}

public class J07076 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            Matrix res = new Matrix(n, m, k);
            res.nextMatrix(sc);
            System.out.print(res);
        }
    }
}
