package TINH_TONG_SO_LONG;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            try {
                long x = Long.parseLong(sc.next());
                if (x > Integer.MAX_VALUE)
                    sum += x;
            } catch (Exception e) {
            }
        }
        System.out.println(sum);
    }
}
