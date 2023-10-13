package J02016_BO_BA_SO_PYTAGO;

import java.util.Arrays;
import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            Arrays.sort(a);
            int i = n - 1, j = i - 1, k = 0;
            int ok = 0;
            while (j > k) {
                if (a[i] == a[j] + a[k]){
                    ok = 1;
                    break;
                }
                if (a[i] > a[j] + a[k]) {
                    k++;
                } else if (a[i] < a[j] + a[k]) {
                    j--;
                }
                if (j == k) {
                    i--;
                    j = i - 1;
                    k = 0;
                }
            }
            if (ok == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
