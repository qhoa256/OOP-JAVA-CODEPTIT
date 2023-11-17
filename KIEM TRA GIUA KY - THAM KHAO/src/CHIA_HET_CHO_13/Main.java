package CHIA_HET_CHO_13;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        BigInteger res = new BigInteger("13");
        while (t-- > 0) {
            boolean ok = false;
            BigInteger x = new BigInteger(sc.nextLine());
            int cnt = 0;
            while (true) {
                StringBuilder tmp = new StringBuilder(x.toString());
                tmp.reverse();
                BigInteger y = new BigInteger(tmp.toString());
                x = x.add(y);
                if (x.mod(res).equals(BigInteger.ZERO)) {
                    ok = true;
                    break;
                }
                cnt++;
                if (cnt == 1000) break;
            }
            if (ok) {
                System.out.println(x.toString());
            } else {
                System.out.println("-1");
            }
        }
    }
}
