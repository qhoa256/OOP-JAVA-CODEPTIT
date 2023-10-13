package J07003_TACH_DOI_VA_TINH_TONG;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while (s.length() >= 2) {
            int n = s.length() / 2;
            BigInteger x = new BigInteger(s.substring(0, n));
            BigInteger y = new BigInteger(s.substring(n));
            BigInteger res = x.add(y);
            s = res.toString();
            System.out.println(s);
        }
    }
}
