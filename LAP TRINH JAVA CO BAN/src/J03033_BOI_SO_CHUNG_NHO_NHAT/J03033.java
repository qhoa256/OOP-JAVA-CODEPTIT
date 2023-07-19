package J03033_BOI_SO_CHUNG_NHO_NHAT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger c = a.gcd(b);
            System.out.println(a.divide(c).multiply(b));
        }
    }
}
