package J03013_HIEU_SO_NGUYEN_LON_1;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.next(), b = sc.next();
            BigInteger x = new BigInteger(a), y = new BigInteger(b);
            BigInteger res = (x.subtract(y)).abs();
            StringBuilder ans = new StringBuilder(res.toString());
            int tmp = Math.max(a.length(), b.length());
            while (ans.length() < tmp) {
                ans.insert(0, "0");
            }
            System.out.println(ans);
        }
    }
}
