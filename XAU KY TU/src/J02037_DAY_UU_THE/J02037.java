package J02037_DAY_UU_THE;

import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            int n = a.length, even = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(a[i]);
                if (x % 2 == 0) even++;
                else odd++;
            }
            if ((n % 2 == 0 && even > odd) || (n % 2 != 0 && even < odd)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
