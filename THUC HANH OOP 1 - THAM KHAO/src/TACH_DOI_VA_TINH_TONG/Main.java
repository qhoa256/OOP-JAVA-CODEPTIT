package TACH_DOI_VA_TINH_TONG;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 1) {
            int n = s.length() / 2;
            String s1 = s.substring(0, n);
            String s2 = s.substring(n);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            s = a.add(b).toString();
            System.out.println(s);
        }
    }
}
