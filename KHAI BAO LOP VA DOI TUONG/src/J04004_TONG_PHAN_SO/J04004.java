package J04004_TONG_PHAN_SO;

import java.util.Scanner;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        phanSo ps1 = new phanSo(sc.nextLong(), sc.nextLong());
        phanSo ps2 = new phanSo(sc.nextLong(), sc.nextLong());
        System.out.println(ps1.add(ps2));
    }
}
