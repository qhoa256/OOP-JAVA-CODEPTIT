package J03039_CHIA_HET;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            BigInteger x1 = new BigInteger(a[0]);
            BigInteger x2 = new BigInteger(a[1]);
            BigInteger res1 = x1.mod(x2);
            BigInteger res2 = x2.mod(x1);
            String tmp = "0";
            BigInteger res = new BigInteger(tmp);
            if (res1.compareTo(res) == 0 || res2.compareTo(res) == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
