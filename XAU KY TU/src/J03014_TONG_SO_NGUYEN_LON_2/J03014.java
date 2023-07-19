package J03014_TONG_SO_NGUYEN_LON_2;

import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        System.out.println(a.add(b));
    }
}
