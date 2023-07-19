package J01002_TINH_TONG_N_SO_NGUYEN_DUONG_DAU_TIEN;

import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- != 0) {
            long n = sc.nextLong();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
