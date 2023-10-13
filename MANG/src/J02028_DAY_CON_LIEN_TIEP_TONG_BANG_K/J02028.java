package J02028_DAY_CON_LIEN_TIEP_TONG_BANG_K;

import java.util.HashSet;
import java.util.Scanner;

public class J02028 {
    public static boolean check(long a[], int n, long k) {
        long sum = 0;
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k || a[i] == k || set.contains(sum - k)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            if(check(a, n, k)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
