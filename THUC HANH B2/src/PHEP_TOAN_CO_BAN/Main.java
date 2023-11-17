package PHEP_TOAN_CO_BAN;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BigInteger> a = new ArrayList<>();
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            BigInteger tmp = new BigInteger(s);
            a.add(tmp);
            res = res.add(tmp);
        }
        System.out.println(Collections.min(a));
        System.out.println(Collections.max(a));
        System.out.println(res);
    }
}
