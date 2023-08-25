package J03037_RUT_GON_XAU_KY_TU;

import java.util.Scanner;

public class tmp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tmp = scanner.nextLine().split(" ");
        int m = Integer.parseInt(tmp[0]);
        int n = Integer.parseInt(tmp[1]);

        tmp = scanner.nextLine().split(" ");
        int[] a = new int[1000];
        for (int i = 0; i < m; i++) {
            int tmp1 = Integer.parseInt(tmp[i]);
            a[tmp1]++;
        }

        tmp = scanner.nextLine().split(" ");
        int[] b = new int[1000];
        for (int i = 0; i < n; i++) {
            int tmp1 = Integer.parseInt(tmp[i]);
            b[tmp1]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (a[i] > 0 && b[i] > 0)
                System.out.print(i + " ");
        }
    }
}