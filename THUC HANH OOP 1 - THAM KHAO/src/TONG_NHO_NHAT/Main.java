package TONG_NHO_NHAT;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long X = 0, Y = 0;
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    X = X * 10 + a[i];
                } else {
                    Y = Y * 10 + a[i];
                }
            }
            System.out.println(X + Y);
        }
    }
}
