package J02012_SAP_XEP_CHEN;

import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int k = i, tmp = a[i];
            while (k > 0 && a[k - 1] > tmp) {
                a[k] = a[k - 1];
                k--;
            }
            a[k] = tmp;
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
